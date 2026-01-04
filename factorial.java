import java.util.*;
public class factorial{
    public static int fact(int n){
        if(n==1||n==0){
            return 1;
        }
        return n*(fact(n-1));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            throw new IllegalArgumentException("invalid");
        }
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
       // System.out.print(fact(n));
    }
}