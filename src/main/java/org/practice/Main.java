package org.practice;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int findIdxOfSmallest(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<= end) {
            int mid = start + ((end - start) / 2);
            int left = (mid + 1 )%arr.length;
            int right = (mid +arr.length- 1 )%arr.length;
            if (arr[mid] < arr[left] && arr[mid] < arr[right])
                return mid;
            else if (arr[0] <= arr[mid]) start = mid+1;
            else end = mid-1;
        }
        return 0;
    }

    public static int binarySearch(int[] arr, int startIdx, int endIdx, int target){
        int start = startIdx;
        int end = endIdx;
        while(start<=end){
            int mid = start + ((end -start)/2);
            if(arr[mid] == target) return mid;
            else if (arr[mid] > target) end = mid -1;
            else start = mid + 1;
        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        if(nums.length == 1 && nums[0] == target) return 0;
        if(nums.length == 1 && nums[0] != target) return -1;

        int sIdx = findIdxOfSmallest(nums);
        if(nums[sIdx] == target) return sIdx;
        int idx1 = binarySearch(nums,0,sIdx-1,target);
        if(idx1>=0) return idx1;
        int idx2 = binarySearch(nums,sIdx+1,nums.length-1,target);
        return idx2;
    }

    public static void main(String[] args) {
        int nums[] = {3,1};
        System.out.println(search(nums,3));
//        System.out.println(binarySearch(nums,0,4,0));
//        System.out.println(findIdxOfSmallest(nums));
    }
}