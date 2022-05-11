import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.*;

public class MovieTest {
    public Movie movie;

    @BeforeEach
    public void beforeEach() {
        movie = new Movie("Film", 0);
        System.out.println(movie);
    }

    @Test
    public void getPriceCode() {
        assertEquals(0, movie.getPriceCode());
    }

    @Test
    public void setPriceCode() {
        movie.setPriceCode(0);
        assertEquals(movie.getPriceCode(), 0);
    }

    @Test
    public void getTitle() {
        assertEquals("Film", movie.getTitle());
    }
}
