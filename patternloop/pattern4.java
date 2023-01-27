package patternloop;
import java.util.Scanner;
public class pattern4
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows");
        int r= sc.nextInt();
        for(int i=1;i<=r;i++)
        //for(int i=r;i>=1;i--)
        {
            //for(int j==1;j<=i;j++)
            for(int j=1;j<=(r+1)-i;j++)//rows==column
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
