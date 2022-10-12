import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        int sum = 0;
        System.out.println("Input a number: ");
        int limit = s.nextInt();
        //  would this be better? : for (int i = s.nextInt(); i > 0; i-- ) {
        for (int i = 1; i <= limit; i++ ) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }

    public static void rangeSum() {
        int sum = 0;
        System.out.println("Input a number: ");
        int numberOne = s.nextInt();
        System.out.println("Input another number: ");
        int numberTwo = s.nextInt();
        if (numberOne < numberTwo) {
            for (int i = numberOne; i <= numberTwo; i ++){
                sum += i;
            }
        }
        else {
            for (int i = numberTwo; i <= numberOne; i ++){
                sum += i;
            }
        }
        System.out.println("The sum is: " + sum);
    }

    public static void factorial() {
        long product = 1;
        System.out.println("Input a number: ");
        for (int i = s.nextInt(); i > 0; i--) {
            product *= i;
        }
        System.out.println("Factorial: " + product);
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
