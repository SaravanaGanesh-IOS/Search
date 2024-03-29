public class FindMinElement {
    public static void main(String[] args) {
        int[] arr = {18, 12, 7, 8, 3, 14, 28};
        System.out.println(findMinElement(arr));
    }

    public static int findMinElement(int[] arr) {
        int minElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minElement) {
                minElement = arr[i];
            }
        }
        return minElement;
    }
}
