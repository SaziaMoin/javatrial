package Loops;
import java.util.Scanner;
public class sumofseriesofn
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();
        int ans=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
              ans=ans-i;
            }
            else {
                ans=ans+i;
            }
        }
        System.out.println("sum of series=" +ans);
    }
}
