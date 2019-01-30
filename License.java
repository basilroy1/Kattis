import java.io.*;
import java.util.Scanner;
class License {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
  int num=scan.nextInt();
  int m=-1;
  int ans=-1;
  for(int i=0;i<num;i++){
    int j=scan.nextInt();
    if(m==-1||j<m){
      m=j;
      ans=i;

    }
  }
  System.out.println(ans);
 }

}