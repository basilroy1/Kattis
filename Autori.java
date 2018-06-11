import java.util.Scanner; 
public class Autori{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    String array= scan.nextLine();
    String s=new String("");
    String x=new String("");
    for(int i=0;i<array.length();i++)
    {
      x=array.substring(0,1);
      if(array.charAt(i)=='-')
      {
        s+=array.substring(i+1,i+2);
      }
    }
    System.out.println(x+s);
  }
}
