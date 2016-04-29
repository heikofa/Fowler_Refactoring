import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Heiko on 29.04.2016.
 */
public class ProgramTest {
    private Customer testCustomer;
    @org.junit.Before
    public void setUp() throws Exception {
        Movie movie1 = new Movie("testMovie", Movie.NEW_RELEASE);
        Movie movie2 = new Movie("testMovie2", Movie.REGULAR);
        Rental rental1 = new Rental(movie1, 5);
        Rental rental2 = new Rental(movie2, 7);
        testCustomer = new Customer("max");
        testCustomer.addRental(rental1);
        testCustomer.addRental(rental2);
    }

    @Test
    public void testStatement() throws Exception {
        assertEquals("Rental Record for max\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\ttestMovie\t\t5\t15.0\n" +
                "\ttestMovie2\t\t7\t9.5\n" +
                "Amount owed is 24.5\n" +
                "You earned 3 frequent renter points", testCustomer.statement());
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }
}