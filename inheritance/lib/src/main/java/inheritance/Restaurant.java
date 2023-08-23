package inheritance;
import inheritance.Review;
import java.util.ArrayList;

public class Restaurant extends Business implements AddReview<Restaurant> {
    protected ArrayList<Review> reviews;
    private int counter = 1;
    protected String name;
    protected double stars;
    protected String price;

    public Restaurant(String name, double stars, int price) {
        super(name, stars, price);
    }


    @Override
    public void addReview(String body, String author, double stars, Restaurant t) {
        Review newReview = new Review(body, author, stars,t);
        this.reviews.add(newReview);
        calculateStarsAfterReview(stars);
    }
}
