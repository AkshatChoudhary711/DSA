package org.practice;

public class NumOfTimesRotated {
    public static int numOfTimesRotated(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] < arr[(mid + 1) % arr.length] && arr[mid] < arr[(mid + arr.length - 1) % arr.length])
                return mid;
            else if (arr[start] > arr[mid-1]) end = mid;
            else start = mid;
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {11,12,15,18,2,5,6,8};
        System.out.println(NumOfTimesRotated.numOfTimesRotated(arr));
    }
}
