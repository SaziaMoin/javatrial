package Loops;

public class firstmultipleof5n7
{
    public static void main(String[] args) {
        int i=1;
        while(true)
        {
            if(i%5==0 && i%7==0)
            {
                System.out.println("first multiple of 5 abd 7=" +i);
                break;
            }
            i++;
        }
    }
}
