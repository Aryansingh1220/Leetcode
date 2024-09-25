class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char[] arr=s.toCharArray();
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!Character.isLetter(arr[i])){
                continue;
            }
            else{
                list.add(arr[i]);
            }
        }
        int i=0;
        int end=list.size()-1;
        while(i<end){
            if(!list.get(i).equals(list.get(end))){
                return false;
            }
            i++;
            end--;
        }
        return true;
    }
}