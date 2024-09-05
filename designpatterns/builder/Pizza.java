package designpatterns.builder;

public class Pizza {
    private boolean hasBasil;
    private boolean hasMushroom;
    private int size;
    private CrustType crustType;


    public Pizza(boolean hasBasil, boolean hasMushroom, int size, CrustType crustType) {
        this.hasBasil = hasBasil;
        this.hasMushroom = hasMushroom;
        this.size = size;
        this.crustType = crustType;
    }
}
