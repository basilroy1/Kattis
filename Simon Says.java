import java.util.Scanner;
class Simon Says{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num =Integer.parseInt(scan.nextLine());
    
    for(int i=0;i<num;i++){
    String s=scan.nextLine();  
      if(s.matches("simon says.*")&&s.length()>11){
        System.out.println(s.substring(11,s.length()));
      }
      else{
          System.out.println();
      }
    }
  }
}