package REVERSE_AND_SWAP;

import java.util.Scanner;

// reverse an array consisting of integers values
public class Reversenumber
{
    static int[] reverse(int []arr) {
        int n = arr.length;
        int[] rev = new int[n];
        /*int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            rev[j++] = arr[i];
        }
        return rev;*/

        int i=n-1,j=0;
        while(i>=0)
        {
            rev[j++]=arr[i--];
        }
        return rev;
    }

        static void printarray(int [] arr)
        {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]+ " ");
            }
        }

    public static void main(String[] args) {
       // int [] arr={1,2,3,4,5};

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("reverse number=");
        int []rev=reverse(arr);
        printarray(rev);
    }
}
