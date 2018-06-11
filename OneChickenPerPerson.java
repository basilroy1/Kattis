import java.util.Scanner;
public class OneChickenPerPerson{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    
    int x1=scan.nextInt();
    int x2=scan.nextInt();
    
   
    int res=0;
    res=x2-x1;
   if(res>=0)

{
  if(res==1)
    {
      
      System.out.println("Dr. Chaz will have " +res+ " piece of chicken left over!");
    }
    else{
      System.out.println("Dr. Chaz will have " +res+ " pieces of chicken left over!");
    }
}
   
  
    
   else {
     if(res==-1)
     {
    res=Math.abs(res);
    System.out.println("Dr. Chaz needs " +res+ " more piece of chicken!");
  
    }
    else{
        res=Math.abs(res);
     System.out.println("Dr. Chaz needs " +res+ " more pieces of chicken!");
    }
  }
}
}