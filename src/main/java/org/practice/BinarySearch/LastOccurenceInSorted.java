package org.practice.BinarySearch;

public class LastOccurenceInSorted {
    public static int lastOccurenceInSorted(int arr[], int element){
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while(start <= end ){
            int mid = start + ((end -start)/2);
            if(arr[mid] == element){
                result = mid;
                start = mid +1 ;
            }else if (arr[mid] > element){
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,6,6,6,7,8};
        System.out.println(LastOccurenceInSorted.lastOccurenceInSorted(arr,6));
    }
}
