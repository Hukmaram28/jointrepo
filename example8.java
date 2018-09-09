import java.util.Scanner;

public class example8 {

    public static void main(String[] args) {
        System.out.println("Enter a target number between 1 to 100 : ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        for (int i = 0; i < 99; i++) {
            System.out.println("Guess the number: ");
            int x = num.nextInt();
            if (x == n) {
                System.out.println("Number guessed matches the original number.");
                System.exit(0);
            }
            if (x > n) {
                System.out.println("Number guessed is more than original number.");
            }
            if (x < n) {
                System.out.println(" Number guessed is less than original number.");
            }
        }
    }
}