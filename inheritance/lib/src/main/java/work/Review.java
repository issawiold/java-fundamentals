package work;

public class Review {
    private String body;
    private String author;
    private double stars;
    private String movie;


    public Review(String body, String author, double stars) {
        setBody(body);
        setAuthor(author);
        setStars(stars);
    }


    public  Review(String body, String author,String movie, double stars){
        setBody( body);
        setAuthor( author);
        setStars(stars);
        this.movie=movie;
    }


    public void setStars(double stars) {
        if (stars >= 0 && stars <= 5) {
            this.stars=stars;
            return;
        } else if (stars > 5) {
            this.stars = 5;
            return;
        }
        this.stars = 0;
        return;
    }

    public double getStars() {
        return stars;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }


    public String toString() {
        return "Review by " + this.author + "\r\nStars: " + this.stars + "\r\nReview: " + this.body;
    }


}
