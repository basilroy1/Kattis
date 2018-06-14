
import java.math.*;
import java.io.*;

public class SimpleAddition{
  public static void main(String args[]) throws IOException
  {
      BufferedReader q = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter y = new BufferedWriter(new OutputStreamWriter(System.out));
    BigInteger big1,big2;
    big1=new BigInteger(q.readLine());
    big2=new BigInteger(q.readLine());
  y.write(big1.add(big2).toString());
  y.flush();
}
}