package inheritance;

public interface AddReview<T> {
    public void addReview(String body, String author, double stars, T object);
}
