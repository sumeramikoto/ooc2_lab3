import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzyPrinterTest {

    @Test
    public void FizzTest() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        String expectedString = "Fizz";
        String resultingString = fizzyPrinter.printFizzy(9);
        assertEquals(expectedString, resultingString);
    }

    @Test
    public void BuzzTest() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        String expectedString = "Buzz";
        String resultingString = fizzyPrinter.printFizzy(10);
        assertEquals(expectedString, resultingString);
    }

    @Test
    public void BangTest() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        String expectedString = "Bang";
        String resultingString = fizzyPrinter.printFizzy(14);
        assertEquals(expectedString, resultingString);
    }

    @Test
    public void FizzbuzzTest() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        String expectedString = "Fizzbuzz";
        String resultingString = fizzyPrinter.printFizzy(15);
        assertEquals(expectedString, resultingString);
    }

    @Test
    public void FizzbuzzbangTest() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        String expectedString = "Fizzbuzzbang";
        String resultingString = fizzyPrinter.printFizzy(105);
        assertEquals(expectedString, resultingString);
    }

    @Test
    public void BoomTest() {
        FizzyPrinter fizzyPrinter = new FizzyPrinter();
        String expectedString = "Boom";
        String resultingString = fizzyPrinter.printFizzy(8);
        assertEquals(expectedString, resultingString);
    }
}
