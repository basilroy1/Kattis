import java.util.Scanner;
public class Sibice{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    int num=scan.nextInt();
    int w=scan.nextInt();
    int h=scan.nextInt();
    int res=0;
    int res1=0;
    res=h*h;
    res1=w*w;
    
    for(int i=0;i<num;i++)
    {
      int x=scan.nextInt();
      int s=x*x;
      if(s<=(res+res1))
      {
        System.out.println("DA");
        
      }
      else{
        System.out.println("NE");
      }
    }
  }
}