public class InfinteArraySearch {
    public static void main(String[] args) {
        int[] arr = randomArray();
        int ans = findTarget(arr, 64614);
        System.out.println(ans);
    }

    public static int[] randomArray() {
        int[] myArray = new int[1000000]; // create an array of 50 integers

        // populate the array with values from 1 to 50
        for (int i = 1; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }

        return myArray;
    }

    static int findTarget(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + ((end - start + 1) * 2);
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
