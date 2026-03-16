package org.practice.BinarySearch;

public class NextAlphabet {
    public static char nextAlphabet(char[] arr, char c) {
        int start = 0;
        int end = arr.length - 1;
        char res = '0';
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == c){
                start = mid + 1;
            }else if(arr[mid] > c){
                res = arr[mid];
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        char arr[] = {'a', 'c', 'd', 'e'};
        System.out.println(nextAlphabet(arr, 'b'));
    }
}
