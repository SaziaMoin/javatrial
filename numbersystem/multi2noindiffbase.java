package numbersystem;
import java.util.Scanner;
public class multi2noindiffbase {
    public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);
        System.out.println("enter binary number");
        int binarynum= sc.nextInt();
        System.out.println("enter decimal number");
        int n= sc.nextInt();
        int decimalnum=0;
        int power=1;
            while(n>0)
            {
              int rem=n%2;
              decimalnum=decimalnum+(rem*power);
              power=power*10;
              n=n/2;
            }
               System.out.println(binarynum*decimalnum);
    }
}