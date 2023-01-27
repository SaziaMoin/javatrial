package conditional;
import java.util.Scanner;
public class asolutevalue
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
        System.out.println("enter any number in -ve/+ve");
        int n=sc.nextInt();
        if(n<0)//if(n!=0)
        {
            n=n*(-1);
            System.out.println("absolute value is -> "+n);
        }
    }
}
