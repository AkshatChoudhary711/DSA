package org.practice.BinarySearch;

public class MinDiffElement {
    public static int minDiffElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start<= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        int d1 = Math.abs(target - arr[start]);
        int d2 = Math.abs(target - arr[end]);
        return d1<d2?start:end;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,10,12,15};
        System.out.println(minDiffElement(arr, 12));
    }
}
