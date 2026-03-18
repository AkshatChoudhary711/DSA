package org.practice.BinarySearch;

public class SearchInBitonicArray {
    public static int searchInBitonicArray(int[] arr, int target) {
        int idx = PeakElement.findPeakElement(arr);
        int res = AscBinarySearch.ascBinarySearch(arr,0,idx-1,target);
        if(res>=0) return res;
        res = DscBinarySearch.dscBinarySearch(arr,idx,arr.length-1,target);
        return res;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,48,6,4,0};
        System.out.println(searchInBitonicArray(arr,40));
    }
}
