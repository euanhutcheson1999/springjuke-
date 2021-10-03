package Jukebox;

import java.util.ArrayList;
import java.util.List;

public class Fleetwood {
    private String songsfm;

    public void fm(String songsfm){
        this.songsfm =songsfm;
    }


    public List<String> songs1() {
        List<String> song1 = new ArrayList<String>();
        song1.add("Second Hand News");
        song1.add("Dreams");
        song1.add("Never Going Back Again");
        song1.add("Don't Stop");
        song1.add("Go Your Own Way");
        song1.add("Songbird");
        song1.add("he Chain");
        song1.add("You Make Loving Fun");
        song1.add("I Don't Want to Know");
        song1.add("Oh Daddy");
        song1.add("Gold Dust Woman");

        return song1;
    }
}
