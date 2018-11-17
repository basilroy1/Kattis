import java.util.Scanner;
class IsItHalloween {
  public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    String s=scan.nextLine();
    if(s.matches("OCT 31")||s.matches("DEC 25")){
    System.out.println("yup");
    }
    else{
          System.out.println("nope");

    }
  }
}