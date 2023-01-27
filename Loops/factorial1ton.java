package Loops;

import java.util.Scanner;

public class factorial1ton
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();
        int i,fact=1;
        for(i=1;i<=n;i++)
        {
            fact = fact * i;
            System.out.println("factorial=" +fact);
        }
    }
}

