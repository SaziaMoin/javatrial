package Loops;

import java.util.Scanner;

public class onetonnumber
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any natural number");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n)
        {
            System.out.println(i);//sout(n)---output->jitna number hoga usko utna baar print kr dega
            i++;
        }
    }
}