package patternloop;
import java.util.Scanner;
public class pattern2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows and column");
        int r= sc.nextInt();
        int c= sc.nextByte();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++) {
                if (i == 1 || i == r || j == 1 || j == c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
