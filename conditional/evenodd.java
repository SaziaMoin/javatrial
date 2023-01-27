package conditional;
import java.util.Scanner;
public class evenodd
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println(n+ " is even");
        }
        if(n%2!=0)
        //else
        {
            System.out.println(n+ " is odd");
        }
    }
}
