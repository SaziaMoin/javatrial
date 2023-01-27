package array_manipulation;
// return the first value that is repeating in the given array if no value being repeated , return -1.
import java.util.Scanner;

public class repeatingnumber
{
    static int firstrepeatingnumber(int [] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++) // first number
        {
            for(int j=i+1;j<n;j++) // second number
            {
                if(arr[i] == arr[j])
                {
                    return arr[i];
                }

            }
        }
        return -1;
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("first repeating element = " +firstrepeatingnumber(arr));
    }
}
