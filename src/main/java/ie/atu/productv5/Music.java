package ie.atu.productv5;

public class Music {
    private double price;
    private String description;
    private String code;
    private String artist;
    private String label;
    protected static int count = 0;

    public Music(){ //empty string
        price = "0.0";
        description = "";
        code = "";
        artist = "";
        label = "";
        count++;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}
