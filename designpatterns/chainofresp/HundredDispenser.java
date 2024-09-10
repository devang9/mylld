package designpatterns.chainofresp;

public class HundredDispenser implements NoteDispenser{
    NoteDispenser nextNoteDispenser;
    @Override
    public void setNextHandler(NoteDispenser noteDispenser) {
        this.nextNoteDispenser = noteDispenser;
    }
    @Override
    public void handle(int amount) {
        int hundredNotesCount = amount/100;
        int remainingAmount = amount%100;
        System.out.println("Number of 100 rupee notes: "+hundredNotesCount);
        if(remainingAmount>0){
            nextNoteDispenser.handle(remainingAmount);
        }
    }
}
