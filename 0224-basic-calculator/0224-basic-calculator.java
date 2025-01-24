class Solution {
    int fun(int i, String s) {
        int ans = 0;
        int sign = 1;
        int num = 0;
        while (i < s.length()) {
            if (s.charAt(i) <= '9' && s.charAt(i) >= '0') {
                num = num * 10 + (s.charAt(i) - '0');
            } else if (s.charAt(i) == '(') {
                int val = fun(i + 1, s);
                if (sign == 1) {
                    ans += val;
                } else {
                    ans -= val;
                }
                i++;
                int open = 1;
                int close = 0;
                while (i < s.length()) {
                    if (s.charAt(i) == '(') {
                        open++;
                    } else if (s.charAt(i) == ')') {
                        close++;
                    }
                    if (open == close) break;
                    i++;
                }
            } else if (s.charAt(i) == ')') {
                if(sign==1) ans += num;
                else ans -= num;
                return ans;
            } else if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                if (sign == 1) {
                    ans += num;
                } else {
                    ans -= num;
                }
                num = 0;
                sign = (s.charAt(i) == '+') ? 1 : -1;
            }
            i++;
        }
        if (sign == 1) {
            ans += num;
        } else {
            ans -= num;
        }
        return ans;
    }

    public int calculate(String s) {
        return fun(0, s);
    }
}
