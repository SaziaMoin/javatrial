package Assignment;
// check number is even and divisible by 3
import java.util.Scanner;

public class check_condition
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();

        if(n%2==0 && n%3==0)
        {
            System.out.println("number is even and divisible by 3");
        }
        else
            System.out.println("it is either even or odd but not divisible by 3");
    }
}
