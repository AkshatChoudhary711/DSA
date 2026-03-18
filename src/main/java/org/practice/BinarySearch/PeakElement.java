package org.practice.BinarySearch;

public class PeakElement {
    public static int  findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(mid == 0){
                if(arr[mid] > arr[mid+1]){
                    return mid;
                }else return mid+1;
            }else if(mid == arr.length-1){
                if(arr[mid] > arr[mid-1]){
                    return mid;
                }else return mid-1;
            }else if(arr[mid]>arr[mid-1] &&  arr[mid]>arr[mid+1]) return mid;
            else if(arr[mid]<arr[mid-1]){
                end = mid-1;
            }else start = mid+1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,6,5,9,10,5};
        System.out.println(findPeakElement(arr));
    }
}
