public class IT22908360Lab9Q3 {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {

        // Expression 1: (3 * 4 + 5 * 7)^2
        int result1;

        result1 = square(
                    add(
                        multiply(3, 4),
                        multiply(5, 7)
                    )
                  );

        // Expression 2: (4 + 7)^2 + (8 + 3)^2
        int result2;

        result2 = add(
                    square(add(4, 7)),
                    square(add(8, 3))
                  );

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}