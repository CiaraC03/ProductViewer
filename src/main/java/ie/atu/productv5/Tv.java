package ie.atu.productv5;

public class Tv {
    private double price;
    private String description;
    private String code;
    private String screenSize;
    private String manufacture;
    protected static int count = 0;

    public Tv(){
        price = "0.0";
        description = "";
        code = "";
        screenSize = "";
        manufacture = "";
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

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
}
