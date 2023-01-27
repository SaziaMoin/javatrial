package conditional;
import java.util.Scanner;
public class divisibleby5and3butnot15
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        if(n%5==0 || n%3==0)
            if(n%15!=0)
            {
                System.out.println("it divisible by either 3 or 5 but not 15");
            }
            else
            {
                System.out.println("it is divisible by 15");
            }
        else
            {
                System.out.println(" it is not divisible by 3 or 5");
            }
    }
}
