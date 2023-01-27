package conditional;
import java.util.Scanner;
public class areaofrectanditsperi
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int l=sc.nextInt();
        System.out.println("enter breadth");
        int b=sc.nextInt();

        int area=(l*b);
        System.out.println("Area 0f rectangle = " +area);

        int perimeter=2*(l+b);
        System.out.println("perimeter of rectangle = " +perimeter);
        if(area>perimeter)
        {
            System.out.println("area is greater than area");
        }
        //else if(perimeter<area)
        if(perimeter>area)
        {
            System.out.println("perimeter is greater than area");
        }
        //else
        if(area==perimeter)
            System.out.println("area and perimeter are equal ");
    }
}
