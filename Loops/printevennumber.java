package Loops;
import java.util.Scanner;
public class printevennumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i -= 2)
        {
            System.out.println(i);
        }
    }
}
