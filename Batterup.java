import java.util.Scanner;
public class BatterUp{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    
    int num=scan.nextInt();
    int array[]=new int[num];
    for(int i=0;i<array.length;i++)
    {
      array[i]=scan.nextInt();
    }
    
    int count=0;
    float sum=0;
    float res=0f;
    
     for(int n=0;n<array.length;n++)
    {
      if(array[n]<0)
      {
        count++;
      }
     
     sum+=array[n];
    
  }
  res=((sum+count)/(num-count)); 
  System.out.println(res); 
}
}
