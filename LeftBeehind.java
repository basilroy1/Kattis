import java.util.Scanner;
public class LeftBeehind{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    
    int sweet=scan.nextInt();
    int sour=scan.nextInt();
    while(true){
      
        if(sweet+sour==13){
        System.out.println("Never speak again.");
        }
        else  if(sweet<sour){
        System.out.println("Left beehind.");
      }
      
      else if(sweet>sour)
      {
        System.out.println("To the convention.");
      }
    else  if(sweet==sour){
        System.out.println("Undecided.");
      }
       
       
      
      sweet =scan.nextInt();
      sour =scan.nextInt();
      if(sweet==0 && sour==0)
    
      break;
    
      
    }      
   }
  }
