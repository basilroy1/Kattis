import java.util.Scanner;
import java.text.DecimalFormat;
class QualityAdjusted {
  public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
double res=0;
int num = scan.nextInt();
for(int i=0;i<num;i++){
   double r=scan.nextDouble();
   double r2=scan.nextDouble();
res+=r*r2;  
}
DecimalFormat df = new DecimalFormat("#.###");
System.out.println(df.format(res));


  }
}