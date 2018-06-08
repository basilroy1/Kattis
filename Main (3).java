import java.util.Scanner;
public class Main 
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int count=0;
    int array[]=new int[num];
    for(int i=0;i<array.length;i++)
    {
      array[i]=scan.nextInt();
    
    }
    
    for(int i=0;i<array.length;i++)
    {
      
      
   
    
    if(array[i]<0)
      {
        count++;
      }
    }
     System.out.println(count);  
    
   
    
    
  
  }
}