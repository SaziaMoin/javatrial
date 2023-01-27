package conditional;
import java.util.Scanner;
public class checkgreatestnumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three integer");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a+ " is a greater number");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+" is a greater number");
        }
        else
        {
            System.out.println(c+ " is a greater number");
        }
    }
}