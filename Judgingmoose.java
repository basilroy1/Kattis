import java.util.Scanner;
public class Judgingmoose{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int num =scan.nextInt();
    int num1 =scan.nextInt();
    
   // if(num==0||num1==0)
    //System.out.println("Not a Moose"); 
    
     if(num==num1  && num!=0&&num1!=0)
        System.out.println("Even "+(num*2));
      
  
      
    else if(num!=num1)
      System.out.println ("Odd " +(max(num,num1)*2 ));
      else{
        System.out.println("Not a moose");
      }
  }
  public static int max(int a,int x)
  {
    if(a>x)
    {
      return a;
    }
    
      return x;
    
  }
}