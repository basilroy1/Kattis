import java.util.Scanner;

public class Herma{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double r = scan.nextDouble();

    double taxiCab = 2*(r*r);

    double norm = Math.PI*(r*r);

    System.out.println(norm);
    System.out.println(taxiCab);
  }
}