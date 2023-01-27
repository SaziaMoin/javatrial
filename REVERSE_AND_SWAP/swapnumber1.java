package REVERSE_AND_SWAP;

// swap two number a and b using method
public class swapnumber1
{
    static void swap(int a , int b)
    {
        System.out.println("values before swap");
        System.out.println("a=" +a);
        System.out.println("b=" +b);

        int temp=a; // temp=9
        a=b;        // a=3
        b=temp;     //b=9

        System.out.println("values after swap");
        System.out.println("a=" +a);
        System.out.println("b=" +b);

    }

    public static void main(String[] args) {
        int a=9;
        int b=3;
        swap(a,b);
    }
}
