package calculator;

/**
 * A simple calculator class that can perform basic arithmetic operations.
 */
public class Calculator {
    private double result;

      /**
     * Constructs a Calculator with an initial result value.
     *
     * @param result The initial result value.
     */

    public Calculator(double result) {
        this.result = result;
    }

    public void add(double value) {
        result += value;
    }

    public void subtract(double value) {
        result -= value;
    }

    public void divide(double value) {
        result /= value;
    }

    public void multiply(double value) {
        result *= value;
    }

    /**
     * Gets the current result value.
     *
     * @return The current result value.
     */
    public double getResult() {
        return result;
    }
}
