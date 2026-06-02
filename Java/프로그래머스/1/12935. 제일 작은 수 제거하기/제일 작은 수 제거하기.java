class Solution {
    public int[] solution(int[] arr) {
        int l = arr.length -1 ;
        
        if(l == 0) return new int[]{-1};
        
        int[] answer = new int[l];
        
        int min = 0;
        int idx = 0;
        for(int i = 0; i < arr.length ; i++){
            
            if(i ==0 ){
                min = arr[i];
                continue;
            }
            
            if (min > arr[i]){
                min = arr[i];
                idx= i;
            }
        }
        
            int answerIdx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (i == idx) continue;
            
            answer[answerIdx] = arr[i];
            answerIdx++;
        }
        
        return answer;
    }
}