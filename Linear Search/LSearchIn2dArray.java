import java.util.Arrays;
import java.util.Scanner;

public class LSearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 123}
        };
        int target = 56;
        int[] indexArray = searchElement(arr, target);

        //Find the index of the target value
        System.out.println(Arrays.toString(indexArray));

        //MaxElement in the 2D Array
        System.out.println(Arrays.toString(maxElementin2DArray(arr)));
    }

    //region SearchElement in 2DArray
    // returnvalue: Array of row anc col
    static int[] searchElement(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }
    //endregion

    //region MaxElement
    //return value: Max and min element in the 2d array in a int array [minvalue, maxvalue]
    static int[] maxElementin2DArray(int[][] arr) {
        int maxElement = arr[0][0];
        int minElement = arr[0][0];
        for (int row = 1; row < arr.length; row++) {
            for (int col = 1; col < arr[row].length; col++) {
                if (arr[row][col] > maxElement) { maxElement = arr[row][col]; }
                if (arr[row][col] < minElement) { minElement = arr[row][col]; }
            }
        }
        return new int[] { minElement, maxElement };
    }
    //endregion
}
