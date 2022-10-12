import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        int evenNumbers = 0;
        int oddNumbers = 0;
        while (true) {
            if (s.nextInt() %2 == 0) {
                evenNumbers ++;
            }
            else {
                oddNumbers ++;
            }
            System.out.printf("Even Numbers: %d \n Odd Numbers: %d\n",evenNumbers,oddNumbers);
        }
    }

    public static void mean() {
        int meanInt = 0;
        int meanCount = 0;
        while (true) {
            if (s.nextLine().equals("break")) {
                break;
            }
            meanInt += s.nextInt();
            meanCount ++;
            System.out.println("The mean of the numbers collected is:" + meanInt / meanCount + "\n");
        }
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
