package numbersystem;
import java.util.Scanner;
public class binarytodecimal
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any binary number");
        int n= sc.nextInt();
        int ans=0;
        int power=1;
        while(n>0)
        {
            int lastdigit=n%10;
            ans=ans+(lastdigit*power);
            power=power*2;
            n=n/10;
        }
        System.out.println("decinal number=" +ans);
    }
}
