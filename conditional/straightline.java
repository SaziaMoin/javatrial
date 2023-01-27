package conditional;
import java.util.Scanner;
public class straightline
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int x1= sc.nextInt();
        int x2= sc.nextInt();
        int x3= sc.nextInt();
        int y1= sc.nextInt();
        int y2= sc.nextInt();
        int y3= sc.nextInt();
        if((y2-y1)/(x2-x1)==(y3-y2)/(x3-x2))
        {
            System.out.println("the three points lie on a single line");
        }
        else
        {
            System.out.println("they do not lie on a single line");
        }
    }
}
