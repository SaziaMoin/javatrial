package Advanced_array;
// sorted array in acsending array
import java.util.Arrays;
import java.util.Scanner;

public class ques5sameas4 {
    static void smallestelementstolargest(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();

        int []arr=new int[n];
        System.out.println("enter " +n+ " elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
       smallestelementstolargest(arr);
    }
}
