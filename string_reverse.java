import java.util.*;
public class string_reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder str2=new StringBuilder(str);
        str2.reverse();
        String rev=str2.toString();
        System.out.print(rev);
    }
}