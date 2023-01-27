package Loops;
import java.util.Scanner;
public class araisetothepowerb
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of a and b");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int ans=1;
        for(int i=1;i<=b;i++)
        {
            ans=ans*a;
        }
        System.out.println(a+ " raise to the power of " +b+ " = " +ans);
    }
}
