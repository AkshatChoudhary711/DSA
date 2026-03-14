package org.practice;

public class AscBinarySearch {
    public static int ascBinarySearch(int arr[], int element){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + ((end -start)/2);
            if(arr[mid] == element) return mid;
            else if (arr[mid] > element) end = mid -1;
            else start = mid + 1;
        }
        return -1;
    }

    public static int ascBinarySearch(int arr[],int startIdx,int endIdx, int element){
        int start = startIdx;
        int end = endIdx;
        while(start<=end){
            int mid = start + ((end -start)/2);
            if(arr[mid] == element) return mid;
            else if (arr[mid] > element) end = mid -1;
            else start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr [] = {1};
        System.out.println(AscBinarySearch.ascBinarySearch(arr,1));
    }
}
