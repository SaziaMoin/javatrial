package Loops;
import java.util.Scanner;
public class fibonacci
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        int a=1;
        int b=1;
        for(int i=1;i<=n;i++)
        {
            System.out.println(a+ " ");
            int sum;
            sum=a+b;
            a=b;
            b=sum;
        }
    }
}
