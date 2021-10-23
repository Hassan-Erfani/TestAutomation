import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 2;
        double result = calculator.add(a, b);
        Assertions.assertEquals(3, result);

    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 3;
        //final double substract = calculator.subtract(a, b);
        //Assertions.assertEquals(2, substract);
        Assertions.assertEquals(2, calculator.subtract(a, b));
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }

    @Test
    void modulo() {
    }

    @Test
    void sum() {
    }
}