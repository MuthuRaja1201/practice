import java.util.*;
public class reversenumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //18
        int rev=0;
        while(n>0){
            int digit=n%10; //8 //1
            rev=rev*10+digit; // 0*10+8=8 // 8*10+1=81 
            n=n/10; // 1 //01
        }
        System.out.println(rev);
    }
}