public class Calculator {

    // add two numbers
    public static double add(double a, double b) {
        return a + b;
    }

    // subtract two numbers
    public static double subtract(double a, double b) {
        return a - b;
    }

    //  multiply two numbers
    public static double multiply(double a, double b) {
        return a * b;
    }

    // divide two numbers
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    // calculate power
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    //  calculate square root
    public static double squareRoot(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println("Add: " + add(5, 3));
        System.out.println("Subtract: " + subtract(5, 3));
        System.out.println("Multiply: " + multiply(5, 3));
        System.out.println("Divide: " + divide(5, 3));
        System.out.println("Power: " + power(5, 3));
        System.out.println("Square Root: " + squareRoot(25));
    }
}
