package work;

public class Shop extends Business  {
    private String description;

    public Shop(String name, String description, double stars, int price) {
        super(name, stars, price);
        setDescription(description);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return super.toString() + "Description: " + this.description;
    }




}
