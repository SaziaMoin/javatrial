package patternloop;
import java.util.Scanner;
public class pattern10
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows");
        int r= sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for (int j = 1; j <= r - i; j++)
            {
                System.out.print(" ");//for spaces r-i
            }
            for (int k = 1; k <=i; k++)
            {
                System.out.print(k);//for stars 2*r-1
            }
            for(int l=i-1;l>=1;l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}