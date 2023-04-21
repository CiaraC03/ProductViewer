package ie.atu.productv5;

import ie.atu.productv2.Book;

public class MusicDB {

    public static Music getMusic(String productCode){

        Music myMusic = null;
        if (productCode.equalsIgnoreCase("pink")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here by Pink Floyd");
            myMusic.setPrice(8.00);
            myMusic.setArtist("Pink Floyd");
        } else if (productCode.equalsIgnoreCase("queen")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Bohemian rhapsody");
            myMusic.setPrice(10.00);
            myMusic.setArtist("Queen");
        } else if (productCode.equalsIgnoreCase("RHCP")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Lennon's MySQL");
            myMusic.setPrice(54.50);
            myMusic.setArtist("Jim Lennon");
        }

        return myMusic;
    }
}
