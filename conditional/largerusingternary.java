package conditional;
import java.util.Scanner;
public class largerusingternary
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        int n1= sc.nextInt();
        int n2= sc.nextInt();

       String num= (n1>n2)? n1+"is larger": n2+ " is larger";
        System.out.println(num);
    }
}
