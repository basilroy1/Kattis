import java.util.Scanner;

public class MixedFractions{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();

    while(x!=0 && y!=0){
      int f = x/y;
      int r = x%y;
      System.out.println(f +" "+ r +" / "+ y);
 x = scan.nextInt();
       y = scan.nextInt();
      
    }
  }
}
