package conditional;
import java.util.Scanner;
public class checkthreedigit
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter three digit number");
        int n=sc.nextInt();
        if(n>99 && n<1000)
        {
            System.out.println(n+ " is a three digit number");
        }
        else
        {
            System.out.println(n+ " is not a three digit number");
        }
    }
}
