package REVERSE_AND_SWAP;

import java.util.Scanner;

public class rev_and_swap
{
    static void swapinarray(int[]arr, int i ,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reversearray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swapinarray(arr, i, j);
            i++;
            j--;
        }
    }
        static void printarray(int [] arr)
        {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]+ " ");
            }
    }

        public static void main(String[] args) {
        //int[] arr={1,2,3,4,5,6};

            Scanner sc = new Scanner(System.in);
            System.out.println("enter size of array");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("enter " + n + " elements");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("reverse array");
        reversearray(arr);
        printarray(arr);
    }
}
