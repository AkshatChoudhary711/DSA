package org.practice.BinarySearch;

public class NumOfTimesRotated {
    public static int numOfTimesRotated(int arr[]){
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

    public static void main(String[] args) {
        int arr[] = {11,13,15,17};
        System.out.println(NumOfTimesRotated.numOfTimesRotated(arr));
    }
}
