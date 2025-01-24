// import java.util.*;

// class Solution {
//     List<String> ans = new ArrayList<>();

//     void fun(int i, int n, StringBuilder str, Set<Integer> used) {
//         if (str.length() == n) {
//             ans.add(str.toString());
//             return;
//         }
//         for (int j = 1; j <= n; j++) {
//             if (!used.contains(j)) {
//                 used.add(j);
//                 str.append(j);
//                 fun(i + 1, n, str, used);
//                 str.deleteCharAt(str.length() - 1);
//                 used.remove(j);
//             }
//         }
//     }

//     public String getPermutation(int n, int k) {
//         Set<Integer> used = new HashSet<>();
//         StringBuilder str = new StringBuilder();
//         fun(1, n, str, used);
//         return ans.get(k - 1);
//     }
// }


import java.util.*;

class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        
        int[] factorial = new int[n];
        factorial[0] = 1;
        for (int i = 1; i < n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }

        k--;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int idx = k / factorial[n - 1 - i];
            result.append(nums.get(idx));
            nums.remove(idx);
            k %= factorial[n - 1 - i];
        }

        return result.toString();
    }
}
