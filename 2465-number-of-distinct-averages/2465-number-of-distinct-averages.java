class Solution {
    public int distinctAverages(int[] nums) {
        int n=nums.length;
        HashSet<Double>set=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<n/2;i++){
            double avg=(nums[i]+nums[n-i-1])/2.0;
            set.add(avg);
        }
        return set.size();
    }
}