import java.util.Scanner;

public class IsPrimeForLoop {
    public static boolean isPrime(int num) {
        int numSqrt = (int)Math.sqrt(num);
        for (int i = 2; i <= numSqrt; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        try {
            int num = Integer.parseInt(in.nextLine());
            for(int i = 1; i <= num; i++) {
                System.out.printf("The integer %d is prime: %b",i, isPrime(i));
            }
        }
        catch (NumberFormatException nfe) {}

    }
}
