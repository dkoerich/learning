import java.util.Scanner;

public class MaximumFinder {
    public void determineMaximum() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three floating-point values separated by spaces: ");

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = maximum(number1, number2, number3);

        // System.out.printf("Maximum is %f\n", result);
        System.out.println("Maximum is " + result);

        input.close();
    }

    private double maximum(double x, double y, double z) {
        /*
        double maximumValue = x;
        if (y > maximumValue) {
            maximumValue = y;
        }
        if (z > maximumValue) {
            maximumValue = z;
        }
        return maximumValue;
        */
        return Math.max(Math.max(x, y), z);
    }
}
