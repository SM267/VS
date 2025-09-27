import java.util.*;
public class RemoveDuplicates 
{
    
    public static void Sort(int [] nums){
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
    public static int check(int[] nums) {
        int ii=0;
        for(int i=0;i<nums.length;i++){
            if(nums[ii]!=nums[i]){
                nums[ii+1]=nums[i];
                ii++;
            }
        }
        return ii+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        RemoveDuplicates.Sort(nums);
        System.out.println("Array after sorting:");
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        int k=RemoveDuplicates.check(nums);
        System.out.println("Number of Unique Numbers:" +k);
        System.out.println("Array after removing duplicates:");
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+" ");
        }
    }
}