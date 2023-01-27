package Loops;

public class print1t050exceptmultipleof3
{
    public static void main(String[] args) {
        /*for(int i=1;i<=50;i++)
        {
            if(i%3==0)
            {
                continue;
            }
            System.out.println(i);
        }*/
        int i=1;
        while(i<=50)
        {
            if(i%3==0)
            {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
