package org.practice;

public class OrderAgnosticSearch {

    public static int orderAgnosticSearch(int arr[], int element){
        if(arr.length == 1) return (arr[0]==element)?0:-1;
        else{
            return (arr[0]<=arr[1])?
                    AscBinarySearch.ascBinarySearch(arr,element) :
                    DscBinarySearch.dscBinarySearch(arr, element);
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8};
        int arr2[] = {8,7,6,5,4,3,2,1};
        System.out.println(OrderAgnosticSearch.orderAgnosticSearch(arr1,2));

    }
}
