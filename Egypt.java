import java.util.Scanner;
class Egypt{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int l=0;
    int s1=0;
    int s2=0;
   while(true){
      int num=scan.nextInt();
      int num2=scan.nextInt();
      int num3=scan.nextInt();
      if(num>num2&&num>num3){
        l=num;
        s1=num2;
        s2=num3;
      }
      else if(num2>num&&num2>num3){
        l=num2;
        s1=num;
        s2=num3;
      }
      else{
        l=num3;
        s1=num;
        s2=num2;
      }
      if(num==0&&num2==0&&num3==0){
        break;
      }
      if((l*l)==(s1*s1)+(s2*s2)){
        System.out.println("right");
      }
      else{
        System.out.println("wrong");
      }
   }
  }
}

