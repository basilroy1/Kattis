import java.util.Scanner;
public class QuickEstimate{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
   int num =scan.nextInt();
   int len=0;
   String array[]=new String[num];
   for(int i=0;i<array.length;i++)
   {
     
     array[i]=scan.next();
      len=array[i].length();
      System.out.println(len);
   }
   
  }
}