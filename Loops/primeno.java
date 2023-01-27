package Loops;
import java.util.Scanner;
public class primeno
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();
        int count=0;
        int m=0;
        m=n/2;
        for(int i=2;i<=m;i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number");
                count = 1;
                break;
            }
        }
        if(count==0) {
            System.out.println(n + " is a prime number");
        }
    }
}
