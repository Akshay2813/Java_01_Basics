package com.java.striver.F_binarysearch;

public class B12_SingleElementInSortedArr {
    //540. Single Element in a Sorted Array
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        System.out.println(singleNonDuplicate(arr));
    }

    public static int singleNonDuplicate(int[] arr) {

        //if arr contains sigle element
        if (arr.length == 1) {
            return arr[0];
        }
        //handle edge case differently
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        //handle edge case differently
        if (arr[arr.length - 1] != arr[arr.length - 2]) {
            return arr[arr.length - 1];
        }

        //Binary Search
        int low = 1;
        int high = arr.length - 2;
        int mid = low + (high - low) / 2;
        while (low <= high) {
            if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
                return arr[mid];
            }
            //even,odd pais exist on left side and hence element is right side
            if ((mid % 2 == 1 && arr[mid] == arr[mid - 1])
                    || (mid % 2 == 0 && arr[mid] == arr[mid + 1])
            ) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }


            mid = low + (high - low) / 2;
        }


        return -1;
    }
}
