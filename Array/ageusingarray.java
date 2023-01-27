package Array;
 class person {
    void array()
    {
        int []age=new int[3];
        float []weight=new float[3];
        String []name=new String[3];

        age[0]=10;
        age[1]=20;
        age[2]=40;
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);

        weight[0]=30f;
        weight[1]=40f;
        weight[2]=50f;
        System.out.println( weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);

        name[0]="sanaya";
        name[1]="sadia";
        name[2]="sana";
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
    }
}
public class ageusingarray{
    public static void main(String[] args) {
    person p=new person();
    p.array();
    }
}
