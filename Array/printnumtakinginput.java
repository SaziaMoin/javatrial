package Array;
import java.util.Scanner;
public class printnumtakinginput
{
    // print number taking from user
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter number of alements");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
