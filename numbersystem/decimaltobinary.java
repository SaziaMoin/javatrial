package numbersystem;
import java.util.Scanner;
public class decimaltobinary
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter decimal number");
        int n= sc.nextInt();
        int binarynum=0;
        int power=1;
        while(n>0)
        {
            int rem=n%2;
            binarynum=binarynum+(rem*power);
            power=power*10;
            n=n/2;
        }
        System.out.println("binary number=" +binarynum);
    }
}
