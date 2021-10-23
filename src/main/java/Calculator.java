import javax.swing.*;

/**
 * Calculator Class
 */
public class Calculator {
    
    /**
     * Addiere die 2 gegebenen Werte
     * @param a Wert 1
     * @param b Wert 2
     * @return das Ergebnis der Addition
     */
    public double add(double a, double b) {
        double  result = a + b;
        printResult(result);
        return result;
    }

    /**
     * Subtrahiere "b" von "a"
     * @param a Wert 1
     * @param b Wert 2
     * @return Das Ergebnis der Subtraktion
     */
    public double subtract(double a, double b) {
        double  result = a - b;
        printResult(result);
        return result;
    }

    /**
     * Mulitpliziere die 2 gegebenen Werte
     * @param a Wert 1
     * @param b Wert 2
     * @return Das Ergebnis der Multiplikation
     */
    public double multiply(double a, double b) {
        double result = a * b;
        printResult(result);
        return result;
    }

    /**
     * Dividiere 2 Werte
     * @param dividend Der Dividend
     * @param divisor Der Divisor
     * @return Das Ergebnis der Division
     */
    public double divide(double dividend, double divisor) {
        // führe die Berechnung nur aus, wenn der divisor ungleich 0 ist
        if (divisor != 0) {
            double  result = dividend / divisor;
            printResult(result);
            return result;
        }
        // sonst liefere einfach 0 zurück
        return 0;
    }

    /**
     * Berechne den Restwert einer Division
     * @param a Der Wert
     * @param mod Der Divisor
     * @return Den Restwert der Division
     */
    public double modulo(double a, double mod) {
        double result = a % mod;
        printResult(result);
        return result;
    }

    /**
     * Summiere alle gegebenen Zahlen
     * @param numberToSumUp zu addierende Zahlen
     * @return  Die Summe aller Zahlen im Array
     */
    public double sum(double[] numberToSumUp) {
        double result = 0;
        for (double n : numberToSumUp) {
            result += n;
        }
        printResult(result);
        return result;
    }

    /**
     * Schreibe den übergebenen Wert in die Konsole
     * @param result Der Wert, welcher in der Konsole ausgegeben werden soll
     */
    public void printResult(double result) {
        System.out.println("The result is: " + result);
    }
}
