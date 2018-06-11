import java.util.Scanner;
class DiceCup{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num=scan.nextInt();
    int num1=scan.nextInt();
    int l=0 ,s=0;
    if(num>num1){
      l=num;
      s=num1;
    }
    else{
      l=num1;
      s=num;
    }
    for(int i=s+1;i<=l+1;i++){
      if(num==num1){
        System.out.println(l+1);
      }
      else{
        System.out.println(i);
      }
    }
  }
}