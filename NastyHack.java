import java.util.Scanner; 
public class NastyHack{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int test=scan.nextInt();
    for(int i=0;i<test;i++)
    {
      int r =scan.nextInt();
      int e =scan.nextInt();
      int c =scan.nextInt();
      e-=c;
      if(r==e)
      {
        System.out.println("does not matter");
      }
      else if((r>e)){
        System.out.println("do not advertise");
      }
      else{
        System.out.println("advertise");
      }
    }
    
  }
}