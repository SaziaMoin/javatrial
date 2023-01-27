package Loops;
import java.util.Scanner;
public class ques1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n= sc.nextInt();
        int sum=0;
        while(n != -1)
        {
           sum=sum+n;
           n= sc.nextInt();
        }
        System.out.println("sum");
    }
}
