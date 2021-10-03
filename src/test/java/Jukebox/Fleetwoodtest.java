package Jukebox;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Fleetwoodtest {

    @Test
    @DisplayName("Test for Fleetwood Mac album genre")
    public void testGetAlbumGenre(){
        Album testalbumfm = new Album();
        testalbumfm.genretype().get(1);
        assertEquals(testalbumfm.genretype().get(0),"Rock", "This test is very simple");


    }
    @Test
    @DisplayName("Test for Fleetwood Mac album year")
    public void testGetAlbumYear() {
        Album testalbumfmyear = new Album();
        testalbumfmyear.songyear().get(1);
        assertEquals(testalbumfmyear.songyear().get(0), 1977, "This test is very simple");
    }
}