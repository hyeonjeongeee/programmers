class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        long total = 0;
        for(int i =1; i<= count; i++){
            total += (long)price * i;
        }
        long min = total - money ;
        if( min >  0 ){
            return min;
        }
        return answer;
    }
}