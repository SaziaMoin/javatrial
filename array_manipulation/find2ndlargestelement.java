package array_manipulation;

import java.util.Scanner;

// find the 2nd largest(maximum) element in the given array
public class find2ndlargestelement
{
    static int findmax(int [] arr)
    {
        int max= Integer.MIN_VALUE; //max= -(minus)infinity----->integer.MIN_VALUE( -(minus)infinity )
        for(int i=0;i<arr.length;i++) // integer.MAX_VALUE( +(plus)infinity )
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
        static int findsecondmax(int [] arr)
        {
            int max=findmax(arr);
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==max)
                {
                    arr[i]=Integer.MIN_VALUE;
                }
            }
            int secondmax=findmax(arr);
            return secondmax;
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

        System.out.println("second maximum element = " +findsecondmax(arr));
    }
}
