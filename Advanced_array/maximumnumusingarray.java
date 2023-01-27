package Advanced_array;
import java.util.Scanner;

public class maximumnumusingarray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements which you want");
        int n= sc.nextInt();
        int []a=new int[n];

        System.out.println("enter the elements");
        int max=0;

        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();

            if( a[i]>max) {
                max =a[i];
            }
        }
        System.out.println("maximum=" +max);
    }
}
