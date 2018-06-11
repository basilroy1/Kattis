import java.util.Scanner;
public class NoDups{
  public static void main(String args[]){
    Scanner scan = new  Scanner(System.in);
    String s=scan.nextLine();
    String array[]=s.split(" ");
    
    boolean r=false;
    for(int i=0;i<array.length;i++){
      for(int j=i+1;j<array.length;j++){
        if(j!=i&&(array[i].equalsIgnoreCase(array[j]))){
          r=true;
        }
      }
    }
    if(r==true)System.out.println("no");
    else System.out.println("yes");
  }
}