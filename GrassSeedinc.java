import java.util.Scanner; 
public class GrassSeedinc{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    double c=scan.nextDouble();
    int test=scan.nextInt();
    double res=0;
    double res1=0;
    double res2=0;
    for(int i=0;i<test;i++)
    {
      double l =scan.nextDouble();
      double w =scan.nextDouble();
      res=l*w;
      res1=res*c;
      res2+=res1;
   
    }
    System.out.println(res2);
    
  }
}
