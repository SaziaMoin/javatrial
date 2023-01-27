package Array;
class Sum{
    void sum1(){
        int []arr={1,3,5};
        int sum=0;
       // for(int i=0;i<arr.length;i++)
        for(int i=0;i<3;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("sum=" +sum);
    }
}
public class sumofelements
{
    public static void main(String[] args) {
        Sum s=new Sum();
        s.sum1();
    }
}
