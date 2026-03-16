package org.practice.BinarySearch;

public class OccurenceInSorted {
    public static int occurenceInSorted(int arr[], int element){
        return LastOccurenceInSorted.lastOccurenceInSorted(arr,element)
                - FirstOccurenceInSorted.firstOccurenceInSorted(arr, element)
                + 1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,4,5,6,6,7,8};
        System.out.println(OccurenceInSorted.occurenceInSorted(arr,4));
    }
}
