import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    private StringCalculator calculator;

    @BeforeEach
    public void beforeEach() {
        calculator = new StringCalculator();
    }

    @Test
    public void testEmptyStringReturnsZero() {
        Assertions.assertEquals(0, calculator.add(""));
    }

    @Test
    public void testOneNumberReturnNumber(){
        Assertions.assertEquals(5, calculator.add("5"));
    }

    @Test
    public void testTwoNumbersReturnSum(){
        Assertions.assertEquals(8,calculator.add("5,3"));
    }

    @Test
    public void testWrongAnswer(){
        Assertions.assertNotEquals(10,calculator.add("5,3"));
    }
}