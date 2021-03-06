// leetcode 12 Integer to Roman.java

public class Solution {
    public String intToRoman(int num) {

        int i;
        String result = "";
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strs = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (i = 0; i < 13; i++) {
            while (num >= nums[i]) {
                num -= nums[i];
                result += strs[i];
            }
        }

        return result;
    }
}
