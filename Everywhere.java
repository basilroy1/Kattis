import java.util.*;
class Everywhere {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int loop=scan.nextInt();
for(int i=1;i<=loop;i++){
int num=scan.nextInt();

HashSet<String>hash=new HashSet<String>();
for(int k=1;k<=num;k++){
  String s=scan.next();
  hash.add(s);
  }
  System.out.println(hash.size());
 
  }

}
}