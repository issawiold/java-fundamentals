package work;

public class Review {
    protected String body;
    protected String author;
    protected double stars;
    protected String movie;
    protected Restaurant restaurant;
    protected Shop shop;
    protected Theater theater;

    public Review(String body, String author, double stars) {
        this.body = body;
        this.author = author;
        setStars(stars);
    }


    public  Review(String body, String author,String movie, double stars){
        this.body = body;
        this.author = author;
        setStars(stars);
        this.movie=movie;
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

    public String toString() {
        return "Review by " + this.author + "\r\nStars: " + this.stars + "\r\nReview: " + this.body;
    }


}
