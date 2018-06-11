import java.util.Scanner;
public class Pet{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    
     int count=0;
     int large=0;
    //int array[][]=new int[5][4];
    for(int i=1;i<=5;i++)
    {
      
      int sum=0;
      for(int j=1;j<=4;j++)
      {
        
      sum=sum+scan.nextInt();
     
      
      }
       if(sum>large)
      {
        large=sum;
        count=i;
      }
      
    
   
    }
      System.out.println(count+" "+large);   
  }
}