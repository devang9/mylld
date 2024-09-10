package designpatterns.chainofresp;

public class FiveHundredDispenser implements NoteDispenser{
    NoteDispenser nextNoteDispenser;
    @Override
    public void setNextHandler(NoteDispenser noteDispenser) {
        this.nextNoteDispenser = noteDispenser;
    }

    @Override
    public void handle(int amount) {
        int fiveHundredNotesCount = amount/500;
        int remainingAmount = amount%500;
        System.out.println("Number of 500 rupee notes: "+fiveHundredNotesCount);
        if(remainingAmount>0){
            nextNoteDispenser.handle(remainingAmount);
        }
    }
}
