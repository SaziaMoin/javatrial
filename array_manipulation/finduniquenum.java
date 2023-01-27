package array_manipulation;

import java.util.Scanner;

// find the unique number in a given array where all the elements are being repeated twice with one value being unique
public class finduniquenum
{
    static int uniquenumber(int[]arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
         for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
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

            System.out.println("unique element in the given number = " + uniquenumber(arr));
        }
    }