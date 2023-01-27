package conditional;
import java.util.Scanner;
public class evenoddusingternary
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();

       String num=(n%2==0)? n+ " is even number": n+ " is odd number";
        System.out.println(num);

    }
}
