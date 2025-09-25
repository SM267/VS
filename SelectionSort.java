import java.util.Scanner;

public class SelectionSort {
    static class Solution {
        public void swap(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public int[] selectionSort(int[] nums){
            for(int i = 0; i < nums.length - 1; i++){
                int min = i;
                for(int j = i; j < nums.length; j++){
                    if(nums[min] > nums[j]){
                        min = j;
                    }
                }
                swap(nums, i, min);
            }
            return nums;
        }
    }

    static class ArrayPrinter {
        public void printArray(int[] arr){
            for(int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Solution sorter = new Solution();
        ArrayPrinter printer = new ArrayPrinter();
        printer.printArray(arr);
        int[] sortedArr = sorter.selectionSort(arr);
        printer.printArray(sortedArr);
        sc.close();
    }
}
