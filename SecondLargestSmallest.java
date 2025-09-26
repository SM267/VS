import java.util.Scanner;
class SecondLargest{
    public int findsl(int[] arr){
        int sl=Integer.MIN_VALUE;
        int l=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }
            else if (arr[i] != l && arr[i] > sl) { 
                sl = arr[i];
            }
        }
        return sl;
    }
}
class SecondSmallest{
    public int findss(int[] arr){
        int ss=Integer.MAX_VALUE;
        int s=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<s){
                ss=s;
                s=arr[i];
            }
            else if (arr[i] != s && arr[i] < ss) {
                ss = arr[i];
            }
        }
        return ss;
    }

}
public class SecondLargestSmallest {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        SecondLargest n1=new SecondLargest();
        SecondSmallest n2=new SecondSmallest();
        System.out.println("The second largest element is: "+n1.findsl(arr));
        System.out.println("The second smallest element is: "+n2.findss(arr));
    }
    
}
