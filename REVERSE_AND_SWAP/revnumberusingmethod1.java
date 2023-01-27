package REVERSE_AND_SWAP;

import java.util.Scanner;

// reverse number using method
public class revnumberusingmethod1
{
    static void reverse(int n) {
        int rev = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println("reverse number" +rev);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of digits");
        int n=sc.nextInt();
       reverse(n);
    }
}
