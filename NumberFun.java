import java.util.Scanner;

public class NuumberFun{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
  int num = scan.nextInt();
  
  for(int i = 1;i<=num;i++)
  {
 
  int a=scan.nextInt();
  int b=scan.nextInt();
  int c=scan.nextInt(); 
  
  
    if(a+b==c)
    {
      System.out.println("Possible");
    }
     else if(Math.abs(a-b)==c)
    {
      
    System.out.println("Possible");
    }

    else if((a/b==c && a%b==0)||(b/a==c && b%a==0 ))
{
  System.out.println("Possible");
}
   
   else if(a*b==c)

    {
      System.out.println("Possible");
    }
    
    else{
      System.out.println("Impossible");
    }
  
  }  
}
}
     