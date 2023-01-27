package classandobject;

import java.util.Scanner;
class Algebra
{
    int add(int a, int b) {
        return (a+b);
    }
}
public class sum
{
    public static void main(String[] args) {

        Algebra ag = new Algebra();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x abd y");
        int x = sc.nextInt();
        int y = sc.nextInt();

       // System.out.print("sum=");
        int ans=ag.add(x,y);
        System.out.println("sum=" +ans);
    }
}
