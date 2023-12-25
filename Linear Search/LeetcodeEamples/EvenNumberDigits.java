package LeetcodeEamples;

/*
Leetcode: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
Q.1295 - Find Numbers with even numbers of digits
 */
public class EvenNumberDigits {
    public static void main(String[] args) {
        int ans = 0;
        int[] nums = {555,901,482,177};
        for(int index = 0; index < nums.length; index++) {
            ans += returnDigitIsEven(nums[index]);
        }

        System.out.println(ans);
    }

    static int returnDigitIsEven(int value) {
        int digitCount = 0;
        while (value > 0) {
            value = value / 10;
            digitCount++;
        }
        return digitCount % 2 == 0 ? 1 : 0;
    }
}
