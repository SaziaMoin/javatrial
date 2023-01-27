package Array;
class age1{
    void page()
    {
        int []age=new int[3];
        age[0]=38;
        age[1]=45;
        age[2]=54;

        int i=0;
        //while(i<age.length)
        while(i<3)
        {
            System.out.println(age[i]);
            i++;//i=i+1;
        }
    }
}
public class printageusingwhile
{
    public static void main(String[] args) {
        age1 a=new age1();
        a.page();
    }
}
