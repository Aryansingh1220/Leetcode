class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int n=nums.length/3;
        List<Integer>list=new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) > n) {
                list.add(key);
            }
        }
        return list;
    }
}