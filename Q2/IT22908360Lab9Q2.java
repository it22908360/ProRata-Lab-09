import java.util.Scanner;

public class IT22908360Lab9Q2 {

    public static double circleArea(double radius) {
        double area;

        area = Math.PI * radius * radius;

        return area;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double radius;
        double area;

        System.out.print("Enter radius: ");
        radius = input.nextDouble();

        area = circleArea(radius);

        System.out.printf("Area of the circle: %.2f%n", area);

        input.close();
    }
}