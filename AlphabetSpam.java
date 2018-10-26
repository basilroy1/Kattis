import java.util.Scanner;
public class AlphabetSpam{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	String s=scan.nextLine();

	int lower=0;
	int upper=0;
	int special=0;
	int w=0;
	for(int i=0;i<s.length();i++){
		int t=(int)s.charAt(i);
	if(t==95){
			w++;
	}
	else if(t>96 && t<123){
			lower++;
	}
	else if(t>64 && t<91){
			upper++;
	}
	else{
			special++;
	}

	}
	System.out.println((double)w/s.length()+"\n"+(float)lower/s.length()+"\n"+(double)upper/s.length()+"\n"+(double)special/s.length());
	
}

}