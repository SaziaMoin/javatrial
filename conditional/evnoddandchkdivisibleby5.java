package conditional;
import java.util.Scanner;
public class evnoddandchkdivisibleby5
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        if(n%2==0 && n%3==0)
        {
            System.out.println(n+ " is even and also divisible by 3");
        }
        else
        {
            System.out.println(n+ " is even/odd but not divisible by 3");
        }
    }
}
