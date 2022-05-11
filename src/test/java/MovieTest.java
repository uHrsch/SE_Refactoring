import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.*;

class MovieTest {
    public Movie movie;

    @BeforeEach
    public void beforeEach() {
        movie = new Movie("Film", 0);
    }

    @Test
    void getPriceCode() {
        assertEquals(0, movie.getPriceCode());
    }

    @Test
    void setPriceCode() {
        movie.setPriceCode(0);
        assertEquals (0, movie.getPriceCode());
    }

    @Test
    void getTitle() {
        assertEquals("Film", movie.getTitle());
    }
}
