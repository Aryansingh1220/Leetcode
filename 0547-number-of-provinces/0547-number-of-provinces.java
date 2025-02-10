class Solution {
    private void dfs(int[][] isConnected, boolean[] visited, int i) {
        visited[i] = true;
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1 && !visited[j]) {
                dfs(isConnected, visited, j);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        boolean[]arr= new boolean[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            if(!arr[i]){
                dfs(isConnected,arr,i);
                count++;
            }
        }
        return count;
    }
}