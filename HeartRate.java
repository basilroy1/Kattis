import java.util.Scanner;
public class HeartRate
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    int test=scan.nextInt();
    double min=0;
    double max=0;
    double avg=0;
    double diff=0;
    
    for(int i=0;i<test;i++)
    {
      double b=scan.nextDouble();
      double p=scan.nextDouble();
      
      min=(60.0)/p;
      avg=(min*b);
      diff=avg-min;
      max=avg+min;
      
      System.out.println(diff+" "+avg+" "+max);
    }
    
  }
}