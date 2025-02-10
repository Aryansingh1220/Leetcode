class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j){
            char c=s[i];
            char d=s[j];
            char temp=c;
            s[i]=d;
            s[j]=temp;
            i++;
            j--;
        }
    }
}