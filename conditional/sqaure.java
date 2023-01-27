package conditional;
import java.util.Scanner;
public class sqaure
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int l1=sc.nextInt();
        int l2=sc.nextInt();
        System.out.println("enter breadth");
        int b1=sc.nextInt();
        int b2=sc.nextInt();
       /* if(l1==l2 && b1==b2)
        {
            System.out.println("it is rectangle");
        }
        */
        if((l1==l2) && (l1==b1) && (l1==b2) && (l2==b1) && (l2==b2) && (b1==b2))
        {
            System.out.println("it is square");
        }
        else
        {
            System.out.println("not a sqaure");
        }
    }
}
