package org.practice.BinarySearch;

public class DscBinarySearch {
    public static int dscBinarySearch(int arr[], int element){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + ((end-start)/2);
            if(arr[mid] == element) return mid;
            else if(arr[mid] > element) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(DscBinarySearch.dscBinarySearch(arr, 5));
    }
}
