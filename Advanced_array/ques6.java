package Advanced_array;
// find smallest and largest elements
import java.util.Arrays;
import java.util.Scanner;

public class ques6 {
    static int [] smallestandlargestelements(int[] arr) {
        Arrays.sort(arr);
        int [] ans={arr[0],arr[arr.length-1]};
        return ans;
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
        int [] ans = smallestandlargestelements(arr);
        System.out.println("smallest" +ans[0]);
        System.out.println("largest" +ans[1]);
    }
}
