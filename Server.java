import java.util.*;
public class Server{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = sc.nextInt();
        int complete = 0;
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            if(total-x>=0){
                total-=x;
                complete++;
            }else i=n;
        }
        System.out.println(complete);
    }
}