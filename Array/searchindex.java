package Array;
class search
{
    void index()
    {
        //linear search implementation
        int [] arr={1,4,5,3,5,8};
        int x=5;
        int ans=-1;
        for(int i=0;i<5;i++)
        //for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                ans=i;
                break;
            }
        }
        System.out.println("found " +x+ " at index "+ans);
    }
}
public class searchindex
{
    public static void main(String[] args) {
    search s=new search();
    s.index();
    }
}
