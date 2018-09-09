import java.util.Scanner;

public class example2 {

    public static void main(String[] args) {
        int n;
        Scanner num= new Scanner(System.in);
        System.out.println("Ënter a Number");
        n=num.nextInt();
        if(n>20 && n<30){
            if(n%2!=0)
            {
                    System.out.println("Tom");
            }
            else{
                System.out.println("Jerry");
            }
        }
        else{
            System.out.println("Number doesn't exist between 20 and 30");
        }
    }
}