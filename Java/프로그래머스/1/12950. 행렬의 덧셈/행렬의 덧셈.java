class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for (int i = 0; i < arr1.length; i++){
            int[] sub = new int[arr1[i].length];
            
            int f = 0;
            for(int j = 0 ; j < arr1[i].length ; j++){
                
                f = arr1[i][j]  + arr2[i][j];
                
                sub[j] = f;
            }
            answer[i] = sub;
        }
        return answer;
    }
}