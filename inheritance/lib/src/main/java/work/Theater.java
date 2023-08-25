package work;

import java.util.Arrays;

public class Theater extends Business {
    private String [] movies;
    public Theater(String name,String [] movies, double stars, int price) {
        super(name, stars, price);
        setMovies(movies);
    }




    public void setMovies(String [] movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return super.toString()+"Movies: "+Arrays.toString(this.movies);
    }

    @Override
    public void calculateStarsAfterReview(double newReviewStars) {
        super.calculateStarsAfterReview(newReviewStars);
    }
    public void addMovie(String movie){
        String [] newMovies=new String[this.movies.length+1];
        for (int i = 0; i < this.movies.length; i++) {
            newMovies[i]=this.movies[i];

        }
        newMovies[this.movies.length]=movie;
        setMovies(newMovies);
    }
    public void removeMovie(String movie) {
        String[] newMovies = new String[this.movies.length - 1];
        int j = 0;

        for (int i = 0; i < this.movies.length; i++) {
            if (!this.movies[i].equals(movie)) {
                newMovies[j] = this.movies[i];
                j++;
            }
        }

        setMovies(newMovies);
    }


    public String[] getMovies() {
        return movies;
    }
    public void addReviewMovie(String body, String author ,String movie ,double stars){
        Review newReview = new Review(body, author,movie, stars);
        addReview(body,author,stars);
    }


}
