import java.io.*;
import java.util.Scanner;
class Harshad {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
  int num=scan.nextInt();
  while(num % sumD(num)!=0){
  num++;
 }

 System.out.println(num);
  }


  public static int sumD(int s){
  int sum=0;
  while(s>0){
    sum+=s%10;
    s/=10;
  }
  return sum;
}
}