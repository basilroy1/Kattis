import java.util.Scanner;
public class Skocimis{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
   int a =scan.nextInt();
   int b=scan.nextInt();
   int c =scan.nextInt();
   int res=(b-a)-1;
   int res1=(c-b)-1;
   if((res == 0 && res1 != 0) || (res1 >= res)){
    System.out.println(res1);
    }
   else{
    System.out.println((res));   
   }
}
}