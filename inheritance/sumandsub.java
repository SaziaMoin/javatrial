package inheritance;
class sumsub { // base class
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}
class multiplication extends sumsub{ // derived class
    public int multi(int a , int b)
    {
        return a*b;
    }
}
public class sumandsub
{
    public static void main(String[] args) {
        multiplication s =new multiplication();
        int a1=s.add(4,5);
        int a2=s.sub(10,5);
        int a3=s.multi(2,3);
        System.out.println(a1+ " " +a2+ " " +a3);
    }
}
