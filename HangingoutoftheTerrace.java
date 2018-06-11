import java.util.Scanner;
public class HangingoutoftheTerrace{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    
    int num=scan.nextInt();
    int test=scan.nextInt();
    String w=new String("");
    int k=0;
    int res=0;
    int count=0;
    
    String s1=new String("enter");
     String s2=new String("leave");
    
    for(int i=0;i<test;i++)
    {
      w=scan.next();
    int t=scan.nextInt();
    
      if(w.equals(s1))
      {
        
      if((k+t)>num)
      {
        count++;
       
      }
      
      else{
        k+=t;
        
      }
      
      
      
      }
      
      else if(w.equals(s2)){
        k-=t;
      }
    
      
    }
   System.out.println(count);   
   
    
}
}