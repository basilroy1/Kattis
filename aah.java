import java.io.*;
import java.util.Scanner;
class aah{
  public static void main(String[] args)throws IOException {
   // Scanner scan = new Scanner(System.in);
   BufferedReader q = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter y = new BufferedWriter(new OutputStreamWriter(System.out));
    String s=q.readLine();
    String s1=q.readLine();
    if(s.length()>=s1.length()){
      //System.out.println("go");
      y.write("go");
    }
    else{
      //System.out.println("no");
      y.write("no");
    }
    y.flush();
  }
}