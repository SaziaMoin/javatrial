package Array;
class Max
{
    void max()
    {
        int []num ={1,5,3,8,2};
       int ans=0;
       //for(int i=0;i<num.length;i++)
       for(int i=0;i<5;i++)
       {
          if(num[i]>ans)
          {
              ans=num[i];
          }
       }
        System.out.println("maximum=" +ans);
    }
}
public class maximum {
    public static void main(String[] args) {
        Max m=new Max();
        m.max();
    }
}
