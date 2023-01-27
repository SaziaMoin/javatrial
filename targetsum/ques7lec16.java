package targetsum;

import java.util.Scanner;

// count the number of triplets whose sum is equal to the given value x
public class ques7lec16
    {
        static int counttriletsum(int[]arr,int target)
        {
            int n=arr.length;
            int ans=0;
            for(int i=0;i<n;i++) // 1st number // i=0-->index-0
            {
                for(int j=i+1;j<n;j++) // 2nd number //j=i+1=0+1=1-->index-1
                {
                    for(int k=j+1;k<n;k++) // 3rd number //k=j+1=1+1=2-->index-2
                    {
                        if (arr[i] + arr[j] + arr[k]== target) {
                            ans++;
                        }
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

            System.out.println("triplets of " +target+" = "+counttriletsum(arr,target));
        }
}
