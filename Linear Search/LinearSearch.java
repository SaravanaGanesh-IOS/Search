import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 23, 45, 55, 12, 44, 89, 456, 34,20, 90};
        Scanner in = new Scanner(System.in);
        int index = lSearch(arr, in.nextInt());
        System.out.println(index);
    }

    // search in the array
    public static int lSearch(int[] arr, int target) {
        if (arr.length == 0) return -1;

        //Enchanced For Loop
        for (int i : arr) {
            if (i == target) {
                return i;
            }
        }
        return -1;
    }
}