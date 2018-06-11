import java.util.Scanner;
public class Oddities
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int array[] = new int[num];
    for(int i=0;i<array.length;i++)
    {
      array[i]=scan.nextInt();
      
    }
    
    
     for(int i=0;i<array.length;i++)
    {
      if(array[i]%2==1||array[i]%2==-1)
      
      {
        System.out.println(array[i]+ " is odd");      
    }
    else if(array[i]%2==0)
    
  {
    System.out.println(array[i]+ " is even");       
  }
   

       }
}
}