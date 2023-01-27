package Advanced_array;

import java.util.Arrays;

public class copyofrange {
    static void printarray ( int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        // for(int i=0;i<5;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main (String[]args){
        int[] arr = new int[5];
        arr[0] = 7;
        arr[1] = 8;
        arr[2] = 9;
        arr[3] = 10;
        arr[4] = 14;

        // print original value
        System.out.println("original array");
        printarray(arr);

        // trying to copy arr to arr_2
        // int []arr_2=arr.clone();
        int[] arr_2 = Arrays.copyOfRange(arr,1,arr.length);//print 0 to arr.length(5)
        System.out.println("copied array");
        printarray(arr_2);
    }
}