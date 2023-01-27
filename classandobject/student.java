package classandobject;
class detail{
    int roll;
    String name;
}
public class student
{
    public static void main(String[] args) {
        detail s1=new detail();
        s1.roll=1;
        s1.name="rohan";
        System.out.println(s1.roll);
        System.out.println(s1.name);

       detail s2=new detail();
       s2.roll=2;
       s2.name="rahul";
        System.out.println(s2.roll);
        System.out.println(s2.name);
    }
}
