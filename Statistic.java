import java.util.Scanner;
public class Statistic{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
   
   
   int largest=0;
   int smallest=0;
   int count=0;
   
   while(scan.hasNextInt()){
    count++;     
   int num =scan.nextInt();
   int array[] = new int[num]; 
   for(int i=0;i<num;i++)
   {
     array[i]=scan.nextInt();
   
   }
    int range=Largest(largest,array)-Smallest(smallest,array);
    System.out.println("Case " +count+": " +(Smallest(smallest,array))+" "+(Largest(largest,array))+" " +range);
   }
  }
  

  public static int Smallest(int smallest,int array[]){
    
    smallest=array[0];
  for(int i=0;i<array.length;i++)
  {
    if(array[i]<smallest)
    {
      smallest=array[i];
    }
  }
    return smallest;
  }
  
  
  
  public static int Largest(int largest,int array[]){
    
   largest=array[0];
  for(int i=1;i<array.length;i++)
  {
    if(array[i]>largest)
    {
      largest=array[i];
    }
  }
  return largest;
}
}
