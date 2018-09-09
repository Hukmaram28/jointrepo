import java.util.Scanner;
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
