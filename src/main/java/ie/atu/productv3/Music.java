package ie.atu.productv3;

public class Music extends Product{

    private String artist;

    public Music(){
        super();
        artist = "";
        count++;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
