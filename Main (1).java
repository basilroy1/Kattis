import java.util.Scanner;

 class Plaina {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int num = scan.nextInt();

    int result = (int)Math.pow(4, num) + f(num);
    System.out.println(result);
  }

  public static int f(int num){
    if(num==1) return 5;
    else {
      return f(num-1) + (int)Math.pow(2, num);
    }
  }
}