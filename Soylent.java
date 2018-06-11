import java.util.Scanner;
public class Soylent{
public static void main(String[]args) 
{
	Scanner scan = new Scanner(System.in);
	
	int num=scan.nextInt();
	int array[]=new int[num];
	
	int cal=400;
	
	for(int i=0;i<array.length;i++)
	{
	  array[i]=scan.nextInt();
	}
	
		for(int i=0;i<array.length;i++)
	{
	if(array[i]%cal==0){
	  	System.out.println(array[i]/cal);
	}
	else{
	  
	
	System.out.println((array[i]/cal)+1);
	}
	}
		
    }
}