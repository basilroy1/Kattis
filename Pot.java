import java.util.Scanner;
public class Pot{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    int num=scan.nextInt();
    int array[]=new int[num];
   
   for(int i=0;i<array.length;i++)
   {
     array[i]=scan.nextInt();
     
   
     
   }
   int g=0;
   int res=0;
   double y=0;
   int x=0;
   double sum=0;
    for(int i=0;i<array.length;i++)
   {
     
     res=array[i]/10;
     x=array[i]%10;    //last digit
     g=array[i]/10;
     y= Math.pow(g,x);
     sum+=y;
     
       
   }
 System.out.println(Math.round(sum));

   
    
    
  }
}