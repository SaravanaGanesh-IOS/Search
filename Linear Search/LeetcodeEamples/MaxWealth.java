package LeetcodeEamples;

/*
Leetcode: https://leetcode.com/problems/richest-customer-wealth/
Q.1672 - Richest Customer Wealth
 */
public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }

    public static  int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int row = 0; row < accounts.length; row++) {
            int sum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                sum += accounts[row][col];
                if (sum > maxWealth) {
                    maxWealth = sum;
                }
            }
        }
        return maxWealth;
    }

}
