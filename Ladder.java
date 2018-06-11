import java.util.Scanner;
public class Ladder
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    int h = scan.nextInt();
    double degrees=scan.nextDouble();
    
    double x=0;
    double f=Math.toRadians(degrees);
    x=(h/(Math.sin(f)));
    System.out.println(Math.round(Math.ceil(x)));
    
    
  }
}