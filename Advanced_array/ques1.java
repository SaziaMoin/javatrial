package Advanced_array;
//count no of occurrence(index) of a particular element x
import java.util.Scanner;
public class ques1 {
    static int countOccurrence(int []arr,int x)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                count++;
            }
        }
        return count;
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
        System.out.println("enter the value of x");
        int x= sc.nextInt();

        System.out.println("no of occurence of x=" +countOccurrence(arr,x));
    }
}
