package classandobject;
import java.util.Scanner;
public class passbyvalue
{
    public static int sum(int a, int b) {
        return (a+b);
    }

    public static void main(String[] args) {
        //int x=5,y=10;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of x and y");
        int x= sc.nextInt();
        int y= sc.nextInt();
        int sum=sum(x,y);
        System.out.println("sum=" +sum);
    }
}
