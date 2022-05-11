import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.*;

public class MovieTest {
    public Movie movie;

    @BeforeEach
    public void beforeEach() {
        movie = new Movie("Film", 15);
        System.out.println(movie);
    }

    @Test
    public void getPriceCode() {
        assertEquals(15, movie.getPriceCode());
    }

    @Test
    public void setPriceCode() {
        movie.setPriceCode(10);
        assertEquals(movie.getPriceCode(), 10);
    }

    @Test
    public void getTitle() {
        assertEquals("Film", movie.getTitle());
    }
}
