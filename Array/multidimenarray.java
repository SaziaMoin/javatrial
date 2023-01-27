package Array;
class Name
{
    void oned(){
        int[] num={2,3,4};
        String[] name={"raj","rahul"};

        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);

    System.out.println(name[0]);
    System.out.println(name[1]);
}

    void twod()
    {
        int[][]digit=new int [2][3];
        int[][]digit1={{2,3},{5,6}};

        digit[0][0]=20;
        digit[0][1]=30;
        digit[1][0]=40;
        digit[1][1]=60;

        System.out.println(digit[0][0]);
        System.out.println(digit[0][1]);
        System.out.println(digit[1][0]);
        System.out.println(digit[1][1]);

        System.out.println(digit1[0][0]);//2---->0,0
        System.out.println(digit1[0][1]);//3---->0,1
        System.out.println(digit1[1][0]);//5---->1,0
        System.out.println(digit1[1][1]);//6----->1,1
    }
}
public class multidimenarray
{
    public static void main(String[] args) {
        Name n=new Name();
        n.oned();
        n.twod();
    }
}
