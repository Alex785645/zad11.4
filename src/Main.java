import java.util.Scanner;
public class Main {
    private static final int ARRAY_SIZE = 10;
    private static int[] numbers = new int[ARRAY_SIZE];

    public static void main(String[] args) {
        fillArray();

        for (int i = 0; i < ARRAY_SIZE; i++) {
            System.out.println("Element " + i + ": " + numbers[i]);
        }
    }
    public static int readNumber() throw NegativewNumberExpection{
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0) {
            throw new NegativewNumberExpection ("Negative numbers are not allowed");
        }
        return number;
    }
    public static void fillArray() {
        for (int i = 0; i < ARRAY_SIZE; i++) {
            try {
                numbers[i] = readNumber();
            } catch (NegativewNumberExpection e) {
                System.out.println("e.getMessage()");
                numbers[i] = 0;
            }


        }
    }
}
