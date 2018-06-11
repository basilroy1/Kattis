import java.util.Scanner;
public class DeathKnightHero{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    int num=scan.nextInt();
     int k=0;
    for(int i=0;i<num;i++)
    {
      k+=(scan.next().indexOf("CD")==-1) ? 1:0;
     
    
    
  
  }
  System.out.println(k);
}
}