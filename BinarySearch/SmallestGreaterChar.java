//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
/*
You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
*/
public class SmallestGreaterChar {
    public static void main(String[] args) {
        char[] arr = { 'c', 'f', 'j' };
        char smallestChar = smallestGreaterCharacter(arr, 'f');
        System.out.println(smallestChar);
    }

    public static char smallestGreaterCharacter(char[] arr, char targetChar) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(targetChar > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start % arr.length];
    }
}
