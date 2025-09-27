import java.util.*;

public class RemoveDuplicates {
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
        int k=RemoveDuplicates.check(nums);
        System.out.println("Number of Unique Numbers:" +k);
        System.out.println("Array after removing duplicates:");
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+" ");
        }
    }
}