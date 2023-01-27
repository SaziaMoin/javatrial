package conditional;
import java.util.Scanner;
public class ageofrmshymandajay
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int ram= sc.nextInt();
      int shyam= sc.nextInt();
      int ajay= sc.nextInt();
      if(ram>shyam)
      {
          if (ram > ajay)
          {
              System.out.println("ram is younger");
          } else
          {
              System.out.println("ajay is younger");
          }
      }
      else
          {
              if(shyam>ajay)
              {
                  System.out.println("shyam is younger");
              }
              else
              {
                  System.out.println("ajay is younger");
              }
          }
  }
}
