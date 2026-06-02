class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] n = phone_number.split("");
        for(int i = 0; i < n.length; i++){
            if(i < n.length -4){
                answer += "*";
                continue;
            }
            
            answer += n[i];
            
        }
        return answer;
    }
}