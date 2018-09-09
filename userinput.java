import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class userinput {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Ënter a Number");
        int x= scan.nextInt();

        System.out.println("Ëntered Number is: ");
        System.out.print(x);
    }

}