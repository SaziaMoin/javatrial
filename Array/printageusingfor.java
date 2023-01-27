package Array;
class age{
    void page()
    {
        int []age=new int[3];
        age[0]=30;
        age[1]=40;
        age[2]=50;
        //for(int i=0;i<age.length;i++)
        for(int i=0;i<3;i++)
        {
            System.out.println(age[i]);
        }
    }
}
public class printageusingfor
{
    public static void main(String[] args) {
        age a=new age();
        a.page();
    }
}
