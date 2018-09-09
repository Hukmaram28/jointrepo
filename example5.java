import java.util.Scanner;

public class example5 {

    public static void main(String[] args) {
        int n; int sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter N: ");
        n=scan.nextInt();
        System.out.println("Enter the values: ");
        for(int i=0; i<n ; i++)
        {    long x=scan.nextInt();
             if(x == (int)x)
            {
                sum+=x;
            }
            else{
                System.out.println("Please enter only integers. ");
                System.exit(0);
            }
        }
        System.out.println("Sum is : " + sum);
    }
}