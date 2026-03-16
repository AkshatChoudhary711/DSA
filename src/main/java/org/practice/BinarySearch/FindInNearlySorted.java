package org.practice.BinarySearch;

public class FindInNearlySorted {
    public static int findInNearlySorted(int arr[], int element){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +((end - start)/2);
            if(arr[mid] == element) return mid;
            if(mid - 1 >= start && arr[mid-1] == element) return mid -1 ;
            if(mid + 1 <= end && arr[mid+1] ==element) return mid+1;
            if(arr[mid]> element) end = mid -2;
            else start = mid + 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,4,6};
        System.out.println(FindInNearlySorted.findInNearlySorted(arr,1));
    }
}
