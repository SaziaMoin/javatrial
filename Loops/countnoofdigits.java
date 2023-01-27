package Loops;
import java.util.Scanner;
public class countnoofdigits
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();
        int i=0;
        while(n>0)
        {
            n=n/10;
            i++;
        }
        System.out.println("number of digits=" +i);
    }
}
