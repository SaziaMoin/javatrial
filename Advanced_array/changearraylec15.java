package Advanced_array;

public class changearraylec15
{
    static void printarray(int []arr)
    {
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i] + " ");
        }
    }
    static void changeArray(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=0;
        }
    }

    public static void main(String[] args) {
        int []arr=new int[3];

        arr[0]=4;
        arr[1]=5;
        arr[2]=6;

        System.out.println("print the value of array");
        printarray(arr);

       System.out.println("value after changing");
        changeArray(arr);//change the value
        printarray(arr);//print the value after changing
    }
}
