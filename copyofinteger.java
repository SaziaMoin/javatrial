public class copyofinteger
{
    static void change_value(int a)
    {
        a=100;
    }
    public static void main(String[] args) {
        int a=4;
        change_value(a);
        System.out.println(a);//4
        // integer is a primitive data type then it does not change the value(it prints original value)
    }
}
