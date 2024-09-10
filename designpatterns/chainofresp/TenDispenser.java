package designpatterns.chainofresp;

public class TenDispenser implements NoteDispenser {
    NoteDispenser nextNoteDispenser;
    @Override
    public void setNextHandler(NoteDispenser noteDispenser) {
        this.nextNoteDispenser = noteDispenser;
    }

    @Override
    public void handle(int amount) {
        int tenNotesCount = amount/10;
        int remainingAmount = amount%10;
        System.out.println("Number of 100 rupee notes: "+tenNotesCount);
        if(remainingAmount>0){
            System.out.println("Change remaining : "+remainingAmount+" , thats mine now, fuck off");
        }
    }
}
