import java.util.*;

public class Solution {
    public String largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));
        
        if (strNums[0].equals("0")) {
            return "0";
        }
        
        StringBuilder str = new StringBuilder();
        for (String s : strNums) {
            str.append(s);
        }
        
        return str.toString();
    }
}
