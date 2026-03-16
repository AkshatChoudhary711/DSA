package org.practice.BinarySearch;

public class FirstOccurenceInSorted {
    public static int firstOccurenceInSorted(int arr[], int element){
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while(start<=end){
            int mid = start + ((end - start)/2);
            if(arr[mid] == element){
                result = mid;
                end = mid -1;
            }
            else if(arr[mid]<element){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,5,5,7,8,9};
        System.out.println(FirstOccurenceInSorted.firstOccurenceInSorted(arr,5 ));
    }
}
