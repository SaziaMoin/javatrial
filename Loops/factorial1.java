package Loops;
import java.util.Scanner;
public class factorial1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int fact=1;
        for(int i=2;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial=" +fact);
    }
}
