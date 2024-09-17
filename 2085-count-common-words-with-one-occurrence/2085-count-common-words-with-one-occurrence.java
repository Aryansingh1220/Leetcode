class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashSet<String>set=new HashSet<>();
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<words1.length;i++){
            set.add(words1[i]);
            map.put(words1[i],map.getOrDefault(words1[i],0)+1);
        }
        for(int i=0;i<words2.length;i++){
            if(!set.contains(words2[i])){
                set.add(words2[i]);
            }
            map.put(words2[i],map.getOrDefault(words2[i],0)+1);
        }
        int count=0;
        
        for(String str:map.keySet()){
            if(map.get(str)<=2){
                count++;
            }
        }
        return count;
    }
}