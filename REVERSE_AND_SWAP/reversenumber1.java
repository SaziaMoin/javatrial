package REVERSE_AND_SWAP;

import java.util.Scanner;

public class reversenumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int rev= 0, rem;
        while (n > 0)
        {
            rem = n % 10;
            rev = rev*10+rem;
            n = n / 10;
        }
        System.out.println("reverse of digits=" + rev);
    }
}
