package work;
import java.util.ArrayList;

public class Restaurant extends Business  {
    protected ArrayList<Review> reviews;
    private int counter = 1;
    protected String name;
    protected double stars;
    protected String price;

    public Restaurant(String name, double stars, int price) {
        super(name, stars, price);
    }



}
