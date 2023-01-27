package classandobject;
import java.util.Scanner;
class algebra {
    int a;
    int b;

    algebra(int x, int y) {
        a = x;
        b = y;
    }

    int add() {
        return a + b;
    }

    int sub() {
        return a - b;
    }

    int mul() {
        return a * b;
    }
}
public class constructorsum
{
    public static void main(String[] args) {
        algebra ag=new algebra(7,5);

        System.out.print("sum=");
        System.out.println(ag.add());

        System.out.print("subtraction=");
        System.out.println(ag.sub());

        System.out.print("multiplication=");
        System.out.println(ag.mul());
    }
}
