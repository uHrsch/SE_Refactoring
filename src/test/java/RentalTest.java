import org.junit.*;
import static org.junit.Assert.assertEquals;

public class RentalTest {

    private Rental rental = new Rental(new Movie("TEST", 0), 0);

    @Test
    public void getDaysRented(){
        assertEquals(0, rental.getDaysRented());
    }

    @Test
    public  void getMovie(){
        assertEquals("TEST", rental.getMovie());
    }
}