import java.util.Scanner;
public class SevenWonders
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    
 String s=scan.nextLine();
 int count=0;
  int count2=0;
   int count3=0;
   int count4=0;
  int sum=0;
  int smallest=0;
  
 for(int i=0;i<s.length();i++)
 {
   if(s.charAt(i)=='T')
   {
     count++;
   }
   
    else if(s.charAt(i)=='C')
   {
     count2++;
   }
   
   else if(s.charAt(i)=='G')
   {
     count3++;
   }
   
  
  
 }
 
 
   if(count<=count2 && count<=count3)
  {
    smallest=count;
  }
  else if(count2<=count3)

  smallest=count2;
 
 
 else {
   smallest=count3;
 }
 
 
 
 int p = 7*smallest;
 sum=((count*count)+(count2*count2)+(count3*count3)+(p));
 System.out.println(sum);
}

   
}
