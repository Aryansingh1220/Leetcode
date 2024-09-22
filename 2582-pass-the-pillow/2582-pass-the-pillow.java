class Solution {
    public int passThePillow(int n, int time) {
        boolean pos=true;
        int count=1;
        while(time>0){
            if(pos==true){
                count++;
                if(count==n){
                    pos=false;
                }
            }
            else{
                count--;
                if(count==1){
                    pos=true;
                }
            }
            time--;
        }
        return count;
    }
}