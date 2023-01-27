package patternloop;
import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows and column");
        int r= sc.nextInt();
        int c= sc.nextInt();
        for (int i = 1; i <= r; i++)//rows
        {
            for (int j = 1; j <= c; j++)//column
            {
                System.out.print(j);
            }
            System.out.print("\n");
            // System.out.println();
        }
    }
}
