class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int sum=0;
        int n=nums.length/2;
        for (int key : map.keySet()) {
            if (map.get(key) > n) {
                return key;
            }
        }
        return -1;
    }
}