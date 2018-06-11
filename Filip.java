import java.util.Scanner;
public class Filip{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    
    int num1=scan.nextInt();
    int num2=scan.nextInt(); 
    int last1=0;
    int last2=0;
    int res1=0;
    int res2=0;
    int N=0;
  int res=0;
   res1=num1%10;
   res2=num2%10;
    if(res1>res2)
    {
      N+=(100*(num1%10));
      N+=(10*((num1%100)/10));
      N+=num1/100;
    }
    else if(res1<res2){
       N+=(100*(num2%10));
      N+=(10*((num2%100)/10));
      N+=num2/100;
    }
    else if(res1==res2)
    {
      if(num1>num2)
      {
        N+=(100*(num1%10));
      N+=(10*((num1%100)/10));
      N+=num1/100;
      }
      else{
        N+=(100*(num2%10));
      N+=(10*((num2%100)/10));
      N+=num2/100;
        
      }
    }
    
    
  System.out.println(N); 
}
}
