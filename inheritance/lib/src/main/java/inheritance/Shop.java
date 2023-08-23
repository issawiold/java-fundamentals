package inheritance;
import inheritance.Restaurant;
import inheritance.Review;

public class Shop extends Business implements AddReview <Shop> {
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



    @Override
    public void addReview(String body, String author, double stars, Shop T) {
        Review newReview = new Review(body, author, stars,T);
        this.reviews.add(newReview);
        calculateStarsAfterReview(stars);
    }
}
