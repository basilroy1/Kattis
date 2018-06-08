import java.util.Scanner;
import java.io.*;
public class Main 
{
  public static void main(String args[]) throws IOException
  {
   // Scanner scan = new Scanner(System.in);
   BufferedReader q = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter y = new BufferedWriter(new OutputStreamWriter(System.out));
   
    String num = q.readLine();
    String num1 =q.readLine();
   int w=Integer.parseInt(num);
    int v=Integer.parseInt(num1);
   
    if(w>0&&v>0)
    {
      //System.out.println("1");
      y.write("1");
    }
    else if(w<0&&v>0)
    {
     // System.out.println("2"); 
     y.write("2");
    }
    
    else if(w<0&&v<0)
    {
     // System.out.println("3"); 
     y.write("3");
    }
    else{
    //System.out.println("4");
    y.write("4");
  }
  y.flush();
  }
}