package Loops;
import java.util.Scanner;
public class onetonnumberusingfor
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any natural number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            System.out.println(i);
        //sout(n)--->n jitna baar hoga usko utna times print karega
    }
}
