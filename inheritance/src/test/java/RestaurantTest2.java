import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest2 {

    @After
    public void tearDown() throws Exception {

    }

    @Test public void testTostringMethod() {
        Restaurant r =new Restaurant("macdonald", "2", 3);
        String message = "Name: " + r.name + "stars: "+ r.stars + "price: " +r.price;
        assertEquals(message,r.toString());
    }

//    @Test
//    public void getName() {
//    }
//
//    @Test
//    public void getStars() {
//    }
//
//    @Test
//    public void getPrice() {
//    }
//
//    @Test
//    public void getReviewList() {
//    }
//
//    @Test
//    public void toString() {
//    }
//
//    @Test
//    public void addReview() {
//    }
//
//    @Test
//    public void avgStars() {
//    }
}