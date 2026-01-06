import java.util.*;
public class armstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int og=n;
        int count=0;
        while(og>0){
            og=og/10;
            count++;
        }
        og=n;
        int s=0;
        while(og>0){
            int digit=og%10;
            s+=(Math.pow(digit,count));
            og/=10;
        }
        System.out.println((n==s)?"Armstrong" : "Not armstrong");
    }
}
