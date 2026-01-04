import java.util.*;
public class reverseofstring{
    public static String reversestr(int i,String str){
        int n=str.length();
        if(i>=n/2){
            return "palindrome";
        }
        else if(str.charAt(i)!=str.charAt(n-i-1)){
            return "not palindrome";
        }
        return reversestr(i+1,str);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(reversestr(0,str));
    }
}