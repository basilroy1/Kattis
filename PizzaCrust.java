import java.util.Scanner;

public class PizzaCrust{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double r = scan.nextDouble();
    double c = scan.nextDouble();
    double cheeseArea = Math.PI*((r-c)*(r-c));

    // Area
    double totalArea = Math.PI*(r*r);
    double percent = (cheeseArea/totalArea)*100;

    System.out.println(percent); 
  }
}