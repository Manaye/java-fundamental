import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {

@Test public void testTostringMethod() {
    Restaurant r =new Restaurant("macdonald", "2", 3);
    String message = "Name: " + r.name + "stars: "+ r.stars + "price: " +r.price;
     assertEquals(message,r.toString());
}

}

