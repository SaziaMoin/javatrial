package Array;
class agee{
    void page()
    {
        int []age=new int[3];
        age[0]=37;
        age[1]=49;
        age[2]=59 ;

        for(int personage:age)
        {
            System.out.println(personage);
        }
    }
}
public class printageusingforeach
{
    public static void main(String[] args) {
        agee a=new agee();
        a.page();
    }
}
