package patternloop;
import java.util.Scanner;
public class pattern5
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
            for (int k = 1; k <= 2 * i - 1; k++)
            {
                System.out.print("*");//for stars 2*r-1
            }
            System.out.println();
        }
    }
}
