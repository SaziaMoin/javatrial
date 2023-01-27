package Loops;
import java.util.Scanner;
public class streamofnumber
    //if you take even number then it will print enen number starts from that number
    //if you take odd number then it will print odd number starts from that number
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        int sum=0;
        while(n!=-1)
        {
            sum+=n;
            n=sc.nextInt();
        }
        System.out.println(sum);
    }
}





