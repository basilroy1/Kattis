import java.util.Scanner;
public class Spavanac
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    
int num = scan.nextInt();
int num1=scan.nextInt();
num1-=45;

if(num1<0)
{
  num-=1;
  num1+=60;
}
 if(num<0)
{
  num=23;
}



  System.out.println(num+ " " +num1);
}
}