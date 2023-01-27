package targetsum;
// find the number of pairs in an array whose sum is equal to the given x
import java.util.Scanner;

public class pairsumlec16
{
    static int Pairsum(int[]arr,int target)
    {
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++) // find 1sr number //i=0--->index-0
        {
            for(int j=i+1;j<n;j++) //find 2nd number //j=i+1=0+1=1--->index-1
            {
                if(arr[i]+arr[j]==target)
                {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int []arr=new int[n];

        System.out.println("enter " +n+ " elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target sum");
        int target= sc.nextInt();

        System.out.println("pair of " +target+" = "+Pairsum(arr,target));
    }
}
