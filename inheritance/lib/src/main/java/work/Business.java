package work;
import java.util.ArrayList;


public class Business {


        private ArrayList<Review> reviews=new ArrayList<>();
        private int counter = 1;
        private String name;
        private double stars;
        private String price;

        protected Business(String name, double stars, int price) {
            setName(name);
            setStars(stars);
            setPrice(price);
        }

        public    String toString() {
            return "the Restaurant's name: " + this.name + "\n\rNumber of stars: " + this.stars + "\n\rPrices: " + this.price;
        }

    public void setName(String name) {
        this.name = name;
    }

    public void setStars(double stars) {
            if (stars >= 0 && stars <= 5) {
                this.stars = stars;
                return;
            } else if (stars > 5) {
                this.stars = 5;
                return;
            }
            this.stars = 0;
            return;
        }

        public void setPrice(int number) {
            String price = "";
            for (int i = 0; i < number; i++) {
                price += "$";
            }
            this.price = price;
        }



        public void calculateStarsAfterReview(double newReviewStars) {
            double previousStars=getStars();
            setStars ((counter * previousStars + newReviewStars)/(counter + 1));
            counter++;
        }

        public ArrayList<Review> getReviews() {
            return reviews;
        }

        public double getStars() {
            return stars;
        }


    public void addReview(String body, String author, double stars) {
        Review newReview = new Review(body, author, stars);
        this.reviews.add(newReview);
        calculateStarsAfterReview(stars);
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}


