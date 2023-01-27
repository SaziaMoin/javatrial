package conditional;
import java.util.Scanner;
public class profitandloss
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter cost price");
        int cp=sc.nextInt();
        System.out.println("enter selling price");
        int sp=sc.nextInt();
        //profit=sp-cp
        if(sp>cp)
        {
            System.out.print("your profit is -> ");
            System.out.println(sp-cp);
        }
        //loss=cp-sp
        if(cp>sp)
        // else
        {
            System.out.print("your loss is -> ");
            System.out.println(cp-sp);
        }

    }
}
