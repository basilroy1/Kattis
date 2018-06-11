import java.util.Scanner;
public class HissingMicrophone{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
   // String s=scan.nextLine();
 
   System.out.println((scan.next().indexOf("ss")!=-1) ? "hiss" : "no hiss"); 
    
  }
}