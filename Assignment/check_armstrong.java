package Assignment;

import java.util.Scanner;

public class check_armstrong
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        int n1;
        n1=n;
        int sum=0;
        while(n1>0)
        {
            sum=n1%10*n1%10*n1%10;
            n1=n1/10;
        }
        if(n==sum)
        {
            System.out.println("not armstrong");
        }
        else
        {
            System.out.println("armstrong");
        }
    }
}
