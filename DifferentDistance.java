import java.util.Scanner;
import java.text.DecimalFormat;
public class DifferentDistance
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    while(true){
      
      
    double x1=scan.nextDouble();
     if (x1==0)
    break;
    double y1=scan.nextDouble();
    double x2=scan.nextDouble();
    double y2=scan.nextDouble();
    double p=scan.nextDouble();
  
   double z=0;
   double f=Math.abs(x1-x2);
   double r=Math.abs(y1-y2);
   double l= Math.pow(Math.pow(f,p)+Math.pow(r,p),1/p);
DecimalFormat n=new DecimalFormat("#.0000000000");
   System.out.println(n.format(l));
    }
  
    
  }
}

