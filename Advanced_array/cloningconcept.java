package Advanced_array;
import java.util.Arrays;
public class cloningconcept
{
    static void printArray(int []arr){
        for(int i=0;i<arr.length;i++)
        // for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int []arr=new int[5];
        arr[0]=7;
        arr[1]=8;
        arr[2]=9;
        arr[3]=10;
        arr[4]=14;

        // print original value
        System.out.println("original array");
        printArray(arr);

        // trying to copy arr to arr_2
       // int []arr_2=arr.clone();
        int []arr_2= Arrays.copyOf(arr,arr.length);
        System.out.println("copied array");
        printArray(arr_2);

        //changing some values of arr_2
        arr_2[0]=0;
        arr_2[1]=0;

        System.out.println("original value after cahnging in arr_2");
        printArray(arr);

        System.out.println("copied value after changing in arr_2");
        printArray(arr_2);
    }
}
