class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer>set=new HashMap<>();
        String[] arr1=s1.split(" ");
        String[] arr2=s2.split(" ");
        for(int i=0;i<arr1.length;i++){
            set.put(arr1[i],set.getOrDefault(arr1[i],0)+1);
        }
        for(int i=0;i<arr2.length;i++){
            set.put(arr2[i],set.getOrDefault(arr2[i],0)+1);
        }
        ArrayList<String>list=new ArrayList<>();
        for(String word:set.keySet()){
            if(set.get(word)==1){
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
}