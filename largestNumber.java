import java.util.*;
public class largestNumber{
    public int lar(int [] arr){
        int max=arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        largest nn=new largest();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The largest element is:"+nn.lar(arr));

    }
}