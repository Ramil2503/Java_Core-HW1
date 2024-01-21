package main;

import calculator.Calculator;

/**
 * The main class to demonstrate the usage of the Calculator class.
 */
public class Main {
    /**
     * The main method that initializes a Calculator, performs various operations,
     * and prints the results.
     *
     * @param args The command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator(0);
        calculator.add(5);
        System.out.println(calculator.getResult());
        calculator.multiply(7);
        System.out.println(calculator.getResult());
        calculator.subtract(30);
        System.out.println(calculator.getResult());
        calculator.divide(5);
        System.out.println(calculator.getResult());
    }
}
