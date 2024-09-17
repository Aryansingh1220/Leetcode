// class Solution {
//     public String kthDistinct(String[] arr, int k) {
//         ArrayList<String>list=new ArrayList<>();
//         HashMap<String,Integer>map=new HashMap<>();
//         for(String str:arr){
//             map.put(str,map.getOrDefault(str,0)+1);
//         }
//         for(String word:map.keySet()){
//             if(map.get(word)==1 && !list.contains(word)){
//                 list.add(word);
//             }
//         }
//         if(k>list.size()){
//             return "";
//         }
//         return list.get(k-1);
//     }
// }

class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> distinctList = new ArrayList<>();
        
        for (String str : arr) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        
        for (String str : arr) {
            if (map.get(str) == 1 && !distinctList.contains(str)) {
                distinctList.add(str);
            }
        }
        
        if (k > distinctList.size()) {
            return "";
        }
        
        return distinctList.get(k - 1);
    }
}
