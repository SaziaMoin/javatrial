package numbersystem;

import java.util.Scanner;
public class add2noindiffbase
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter decimal number");
        int decimalnum= sc.nextInt();
        System.out.println("enter binary number");
        int b= sc.nextInt();
        int binarynum=0;
        int power=1;
        while(b>0)
        {
            int rem=b%2;
            binarynum=binarynum+rem*power;
            power=power*2;
            b=b/10;
        }
        System.out.println(decimalnum+binarynum);
    }
}

