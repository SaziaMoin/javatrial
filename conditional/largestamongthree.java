package conditional;
import java.util.Scanner;
public class largestamongthree
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three number");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println(a+ " is larger");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+ " is larger");
        }
        else if(c>a && c>b)
        {
            System.out.println(c+ " is larger");
        }
    }
}
