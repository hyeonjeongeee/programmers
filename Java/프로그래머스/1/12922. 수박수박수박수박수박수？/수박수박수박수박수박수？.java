class Solution {
    public String solution(int n) {
        String answer = "";
        int c = 1;
        
        while ( c <= n ){
            boolean d = c % 2 == 0;
            
            if(d){
                answer += "박";
            }else{
                answer += "수";
            }
            c++;
        }
        return answer;
    }
}