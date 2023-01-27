package REVERSE_AND_SWAP;

// swap two number a and b
// and then swap the two given values using sum and difference method
public class swapnum1
{
    static void swap(int a , int b)
    {
        System.out.println("values before swap");
        System.out.println("a=" +a);
        System.out.println("b=" +b);

        a=a+b; // a=12
        b=a-b;        // b=9
        a=a-b;     //a=3

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
