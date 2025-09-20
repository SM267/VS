import java.util.Scanner;
public class revarr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter " +n+" elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int num:arr){
            System.out.print(num);
            System.out.print(" ");
        }
        int start=0,end=n-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println();
        for(int num:arr){
            System.out.print(num);
            System.out.print(" ");
        }
    }
}
