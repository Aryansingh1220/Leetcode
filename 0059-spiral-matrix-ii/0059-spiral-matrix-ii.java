class Solution {
    public int[][] generateMatrix(int n) {
        int m=n;
        int k=1;
        int startRow=0;
        int startCol=0;
        int endRow=n-1;
        int endCol=m-1;
        int[][] arr=new int[n][m];
        while(startRow<=endRow && startCol<=endCol){
            for(int j=startCol;j<=endCol;j++){
                arr[startRow][j]=k;
                k++;
            }
            for(int i=startRow+1;i<=endRow;i++){
                arr[i][endCol]=k;
                k++;
            }
            for(int j=endCol-1;j>=startCol;j--){
                arr[endRow][j]=k;
                k++;
            }
            for(int i=endRow-1;i>=startRow+1;i--){
                arr[i][startCol]=k;
                k++;
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return arr;
    }
}