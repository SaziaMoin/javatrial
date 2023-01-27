package conditional;
import java.util.Scanner;
public class studentsmarks
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter marks");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int m4=sc.nextInt();
        int m5=sc.nextInt();
        int marks=m1+m2+m3+m4+m5;
        System.out.println("Marks=" +marks);
        int per=marks/5;
        System.out.println("Percentage=" +per);
        if(per<=100 && per>90)
        {
            System.out.println("excellent");
        }
        else if(per<90 && per>80)
        {
            System.out.println("very good");
        }
        else if(per<80 && per>70)
        {
            System.out.println("good");
        }
        else if(per<70 && per>60)
        {
            System.out.println("can do better");
        }
        else if(per<60 && per>50)
        {
            System.out.println("average");
        }
        else if(per<50 && per>40)
        {
            System.out.println("below average");
        }
        else
        {
            System.out.println("fail");
        }
    }
}
