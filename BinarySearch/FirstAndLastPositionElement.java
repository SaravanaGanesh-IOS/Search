//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
*/

import java.util.Arrays;

public class FirstAndLastPositionElement {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int[] posArr = returnPosArray(arr, 8);
        System.out.println(Arrays.toString(posArr));
    }

    static int[] returnPosArray(int[] arr, int target) {
        int[] posArr = {-1, -1};
        posArr[0] = returnIndex(arr, target, true);
        if(posArr[0] != -1) {
            posArr[1] = returnIndex(arr, target, false);
        }
        return posArr;
    }

    static int returnIndex(int[] arr, int target, boolean isStartIndex) {
        int ans = 0;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(isStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
