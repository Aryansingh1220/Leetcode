class Solution {
    public int minimumOperations(int[] nums) {
        List<Integer>list=new ArrayList();
        for(int num:nums){
            list.add(num);
        }
        int count=0;
        while(true){
            Set<Integer>set=new HashSet<>(list);
            if(set.size()==list.size()){
                break;
            }
            int remove=Math.min(3,list.size());
            for(int i=0;i<remove;i++){
                list.remove(0);
            }
            count++;
        }
        return count;
    }
}