import java.io.*;
import java.util.Scanner;
class DiceGame{
  public static void main(String[] args)throws IOException {
    Scanner scan = new Scanner(System.in);
    int r=0,r1=0;
   ///BufferedReader q = new BufferedReader(new InputStreamReader(System.in));
	//BufferedWriter y = new BufferedWriter(new OutputStreamWriter(System.out));
   for(int i=0;i<4;i++){
    int num=scan.nextInt();
      
    
    r+=num;
   // r1+=i;
   }
   for(int i=0;i<4;i++){
    int num1=scan.nextInt();
    r1+=num1;
   }
    
    if(r>r1){
       System.out.println("Gunnar");
     }
     else if(r1==r){
        System.out.println("Tie");
     }
     else{
        System.out.println("Emma");
     }
     
    
  }
}