public class LinearSearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 8, 3, 14, 28};
        System.out.println(searchInRange(arr, 1, 4, -7));
    }

    static int searchInRange(int[] arr, int start, int end, int target) {
        for (int i = start; i < end; i++) {
            if (arr[i] == target) { return i; }
        }
        return -1;
    }
}
