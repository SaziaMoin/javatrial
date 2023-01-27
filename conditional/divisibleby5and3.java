package conditional;
import java.util.Scanner;
public class divisibleby5and3
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        //if(n%5==0 && n%!=0)-->it is divisible by 5 but not divisible by 3
        if(n%5==0 && n%3==0)
        //if(n%15==0)-->multiplication of 3 and 5 = 15
        {
            System.out.println("it is divisible by 3 and 5");
        }
        else
        {
            System.out.println("it is not divisible by 3 and 5");
        }
    }
}
