package REVERSE_AND_SWAP;

public class swapwithoutusinmethod1
{
    public static void main(String[] args) {
        int a=4;
        int b=5;
        System.out.println("values before swap");
        System.out.println("a=" +a);
        System.out.println("b=" +b);

        int temp=a;
        a=b;
        b=temp;

        System.out.println("values after swap");
        System.out.println("a=" +a);
        System.out.println("b=" +b);

    }
}
