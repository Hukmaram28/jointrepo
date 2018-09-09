import java.util.Scanner;

class example1 {
    public static void main(String args[]) {
        long r, sum = 0, temp, n;
        Scanner num=new Scanner(System.in);
        System.out.println("Ënter a Number");
        n= num.nextLong();
        temp = n;
        while (n > 0) {
            r = n % 10;  //getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            long x=temp;
            long add=0;
            while(temp>0) {
                r = temp % 10;
                if (r % 2 == 0) {
                    add = add + r;
                }
                temp=temp/10;
            }
            if(add>25)
            {
            System.out.println(x + " is palindrome and the sum of even numbers is greater than 25");
        }
        else{
                System.out.println(x + " is palindrome and the sum of even numbers is less than or equal to 25");
            }
        }
        else
            System.out.println(temp + " is not palindrome");
    }
}