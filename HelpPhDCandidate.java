import java.util.Scanner;
class HelpPhDCandidate{
    public static void main(String args[]) {
          Scanner scan = new Scanner(System.in);

    int num=scan.nextInt();
    String array[]=new String[num];
    for(int i=0;i<array.length;i++){
      array[i]=scan.next();
    }
    String l="";
    String s="";
    String s1="";
       for(int i=0;i<array.length;i++){
            if(array[i].matches("P=NP")){
         System.out.println("skipped");
       }
    try{
       String[] splitdata = array[i].split("\\+");
       s=splitdata[0];
       s1=splitdata[1];
      
       int p=Integer.parseInt(s);
       int p1=Integer.parseInt(s1);
       System.out.println(p+p1);
       }
       catch(NumberFormatException  | ArrayIndexOutOfBoundsException e){
        // in case of wrong number format or array index exceeded
       l+=e.getMessage();
       }
}
    }
}
