package net.androidsquad.fashionapp;

public class row {
    private int img;
    private String title;

    //Constructor:
    public row(int img, String title) {
        this.img = img;
        this.title = title;
    }


    public row(){}

    // Gettters
    public int getImg() {
        return img;
    }

    public String getTitle() {
        return title;
    }

}
