package Advanced_array;

import java.util.Scanner;

//check if the given elements is sorted or not
public class ques4
{
    static boolean sorted(int[]arr)
    {
        boolean check= true;
        for(int i=1;i<arr.length;i++)
        {
            /*i=0;
            arr [0] <arr[-1]
             */
            if(arr[i]<arr[i-1])
            {
                //not sorted
                check=false;
                break;
            }
        }
        return check;
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
        System.out.println("is elements sorted = " +sorted(arr));
    }
}
