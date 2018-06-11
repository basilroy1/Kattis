import java.util.Scanner;
class SimonSays{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num =scan.nextInt();
    for(int i=0;i<num+1;i++){
      String s=scan.nextLine();
      if(s.matches("Simon says.*")&&s.length()>11){
        System.out.println(s.substring(11,s.length()));
      }
    }
  }
}