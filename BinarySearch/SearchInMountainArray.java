public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = { 4,5,6,7,0,1,2 };
        int ans = findAns(arr, 0);
        System.out.println(ans);
    }

    static int findAns(int[] arr, int target) {
        int pivot = findPeakElementIndex(arr);
        int foundIndex = -1;
        if (pivot == -1) {
            foundIndex = findTargetElementInAscending(arr, target, 0, arr.length - 1);
        }

        if(arr[pivot] == target) {
            return pivot;
        }
        foundIndex = findTargetElementInAscending(arr, target, 0, pivot -1);
        if (foundIndex == -1) {
            foundIndex = findTargetElementInAscending(arr, target, pivot + 1, arr.length - 1);
        }
        return foundIndex;
    }

    static int findTargetElementInAscending(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findTargetElementInDescding(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(target > arr[mid]) {
                end = mid - 1;
            } else if(target < arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPeakElementIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid -1;
            }
            if(arr[mid] <= arr[start]) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
