import org.junit.jupiter.api.*;
import static org.junit.Assert.assertEquals;

class RentalTest {
    Movie movie = new Movie("TEST", 0);
    private Rental rental = new Rental(movie, 0);

    @Test
    void getDaysRented(){
        assertEquals(0, rental.getDaysRented());
    }

    @Test
    void getMovie(){
        assertEquals(movie, rental.getMovie());
    }
}