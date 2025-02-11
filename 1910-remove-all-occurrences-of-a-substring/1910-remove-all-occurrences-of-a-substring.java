class Solution {
    public String removeOccurrences(String s, String part) {
        // while(s.contains(part)){
        //     s=s.replaceFirst(part,"");
        // }
        // return s;
        StringBuilder sb=new StringBuilder(s);
        int index;
        while((index=sb.indexOf(part))!=-1){
            sb.delete(index,index+part.length());
        }
        return sb.toString();
    }
}