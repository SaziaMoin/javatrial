package Loops;

import java.util.Scanner;

public class printoddnumber
    {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter any natural number");
            int n=sc.nextInt();
            for(int i=1;i<=n;i+=2)
            {
                System.out.println(i);
            }
            //sout(n)--->n jitna baar hoga usko utna times print karega
        }
    }
