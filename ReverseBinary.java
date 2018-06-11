import java.util.Scanner;
public class ReverseBinary{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    String bin = Integer.toBinaryString(n);

    System.out.println(rev(bin));

  }

  public static int rev(String s){
    int value = 0;

    for(int i = 0; i<s.length(); i++){
      if(s.substring(i,i+1).matches("1")){
        value += (int)Math.pow(2,i);
      }
    }

    return value;
  }
}

