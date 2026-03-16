package org.practice.BinarySearch;

public class CeilOfElementInSorted {
    public static int findCeilOfElementInSorted(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid] > target){
                res = arr[mid];
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] ={1,2,4,6,7,9};
        System.out.println(findCeilOfElementInSorted(arr, 4));
    }
}
