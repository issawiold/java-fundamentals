/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {

    @Test
    void testRestaurantConstructor() {
        Restaurant restaurant = new Restaurant("Sample Restaurant", 4, 2);
        assertEquals("Sample Restaurant", restaurant.name);
        assertEquals(4, restaurant.stars);
        assertEquals("$$", restaurant.price); // Check if price is correct based on 2 dollar signs
    }
    @Test
    void testReviewConstructor() {
        Restaurant restaurent= new Restaurant("hello",5,2);
        Review review = new Review("Great food!", "John Doe", 5,restaurent);

        assertEquals("Great food!", review.body);
        assertEquals("John Doe", review.author);
        assertEquals(5, review.stars);
    }

    @Test
    void testStarRatingUpdate() {
        Restaurant restaurant = new Restaurant("Sample Restaurant", 4, 2);
        Review review = new Review("Great food!", "John Doe", 5,restaurant);
        restaurant.addReview(review.body, review.author, review.stars,restaurant);
        assertEquals(4, restaurant.stars); // Initial rating was 4, and the new review is 5 stars
    }
    @Test
    void testRestaurantToString() {
        Restaurant restaurant = new Restaurant("Sample Restaurant", 4, 2);

        String expected = "the Restaurant's name: Sample Restaurant\n\rNumber of stars: 4\n\rPrices: $$";
        assertEquals(expected, restaurant.toString());
    }

    @Test
    void testReviewToString() {
        Restaurant restaurant = new Restaurant("Sample Restaurant", 4, 2);
        Review review = new Review("Great food!", "John Doe", 5,restaurant);

        String expected = "Review by John Doe" + System.lineSeparator()
                + "Stars: 5" + System.lineSeparator()
                + "Review: Great food!";

        assertEquals(expected, review.toString());
    }
}
class ShopTest {



        @Test
        public void testShopToString() {
            Shop shop = new Shop("Fashion Haven", "Trendy clothes and accessories", 4.2, 2);
            assertEquals("the Restaurant's name: Fashion Haven\nNumber of stars: 4.2\nPrices: $$Description: Trendy clothes and accessories", shop.toString());
        }

        @Test
        public void testAddReview() {
            Shop shop = new Shop("Electronics World", "Latest gadgets and electronics", 3.8, 2);
            shop.addReview("Great selection and helpful staff!", "TechEnthusiast", 4.0,shop);
            assertEquals(1, shop.getReviews().size());
            assertEquals(4.0, shop.getStars());
        }

        @Test
        public void testStarsCalculation() {
            Shop shop = new Shop("Book Nook", "A paradise for book lovers", 4.7, 1);
            shop.addReview("Amazing collection of books!", "Bookworm123", 5.0,shop);
            shop.addReview("Cozy atmosphere and friendly staff.", "LiteraryLover", 4.5,shop);
            assertEquals(4.75, shop.getStars());
        }


}

 class TheaterTest {

    @Test
    public void testAddMovie() {
        Theater theater = new Theater("Movie Magic", new String[]{"Movie A", "Movie B"}, 4.0, 2);
        theater.addMovie("Movie C");
        assertArrayEquals(new String[]{"Movie A", "Movie B", "Movie C"}, theater.getMovies());
    }

    @Test
    public void testRemoveMovie() {
        Theater theater = new Theater("Cineplex", new String[]{"Avengers", "Inception", "Joker"}, 4.5, 3);
        theater.removeMovie("Inception");
        assertArrayEquals(new String[]{"Avengers", "Joker"}, theater.getMovies());
    }

    @Test
    public void testAddReviewMovie() {
        Theater theater = new Theater("Star Cinema", new String[]{"Movie X", "Movie Y"}, 3.8, 2);
        theater.addReviewMovie("Great film!", "MovieBuff123", "Movie X", 4.5);
        assertEquals(1, theater.getReviews().size());
        assertEquals(4.5, theater.getStars());
    }

    @Test
    public void testToString() {
        Theater theater = new Theater("Classic Movies", new String[]{"Casablanca", "Gone with the Wind"}, 4.2, 2);
        assertEquals("the Restaurant's name: Classic Movies\nNumber of stars: 4.2\nPrices: $$Movies: [Casablanca, Gone with the Wind]", theater.toString());
    }
}

