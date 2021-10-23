import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }
    @Test
    void add() {
        Assertions.assertEquals(3, calculator.add(1, 2));
    }

    @Test
    void subtract() {
        Assertions.assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    void multiply() {
        Assertions.assertEquals(4, calculator.multiply(2, 2));
        Assertions.assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void divide() {
        Assertions.assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    void modulo() {
        Assertions.assertEquals(4, calculator.modulo(9, 5));
    }

    @Test
    void sum() {
        Assertions.assertEquals(7, calculator.sum( new double[]{3,4}));
    }
}