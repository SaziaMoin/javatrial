package Loops;
import java.util.Scanner;
public class sumofnaturalnumberusingfor
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum + i;
        }
        System.out.println("sum of natural number = " +sum);
    }
}
