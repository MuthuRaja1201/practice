import java.util.*;
public class mergearray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int arr1[]=new int[m];
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        int mergedarray[]=new int[m+n];
        int k=0;
        for(int i=0;i<m;i++){
            mergedarray[k++]=arr1[i];
        }
        for(int i=0;i<n;i++){
            mergedarray[k++]=arr2[i];
        }
        for(int i:mergedarray){
            System.out.print(i+" ");
        }
    }
}
