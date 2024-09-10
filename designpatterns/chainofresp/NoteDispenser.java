package designpatterns.chainofresp;

public interface NoteDispenser {
    void setNextHandler(NoteDispenser noteDispenser);
    void handle(int amount);
}
