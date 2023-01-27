package conditional;
import java.util.Scanner;
public class triangle
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter three sides");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if((a+b)>c && (b+c)>a && (a+c)>b)  //if(a+b+c==180)-->according to angle
        {
            System.out.println("valid triangle");
        }
        else
        {
            System.out.println("invalid triangle");
        }
    }
}
