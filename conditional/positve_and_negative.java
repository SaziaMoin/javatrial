package conditional;

import java.util.Scanner;

public class positve_and_negative
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any positive or negative number");
        int n=sc.nextInt();

        if(n>0)
        {
            System.out.println(n+ " is positive number");
        }
        else
        {
            System.out.println(n+ " is negative number");
        }

       /*
        String s=(n>0)?"it is a positive number":"it is a negative number";
        System.out.println(s);
       */
    }
}
