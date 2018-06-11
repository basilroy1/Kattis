import java.util.Scanner;
public class FizzBuzz
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner (System.in);
    
    int x =scan.nextInt();
    int y =scan.nextInt();
    int z =scan.nextInt();
    for(int i=1;i<=z;i++)
    {
      if(i%x==0&&i%y!=0)
      {
      System.out.println("Fizz");
      }
      else if(i%y==0&&i%x!=0)
      
      {System.out.println("Buzz");
      
        
      }
       else if(i%y==0&&i%x==0) {
        System.out.println("FizzBuzz");
      }
      else{
        System.out.println(i);
      }
    }
    
  }
}