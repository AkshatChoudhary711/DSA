package org.practice.BinarySearch;

public class FindInSortedRotated {
    public static int findInSortedRotated(int arr[], int element){
        int idx = NumOfTimesRotated.numOfTimesRotated(arr);
        int idx1 = AscBinarySearch.ascBinarySearch(arr,0, idx-1,element);
        int idx2 = AscBinarySearch.ascBinarySearch(arr,idx,arr.length-1,element);
        if(idx1>=0) return idx1;
        if(idx2>=0) return idx2;
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1};
        System.out.println(FindInSortedRotated.findInSortedRotated(arr,2));
    }
}
