import java.util.Scanner;
public class Carrot
{
  public static void main(String args[]) 
  {
    Scanner scan = new Scanner(System.in);
    
    int num = scan.nextInt();
    int num1= scan.nextInt();
    String array[] = new String[num+1];
    
    
    
    for(int r=0;r<array.length;r++)
    {
      array[r] = scan.nextLine();
    }
   System.out.println(num1);

       
    
   
    
    
  
  }
}