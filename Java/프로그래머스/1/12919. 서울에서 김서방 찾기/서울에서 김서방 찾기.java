class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int cnt = 0;
        for(String nm : seoul){
            if("Kim".equals(nm)) break;
            cnt += 1;
        }
        
        answer = "김서방은 "+cnt+"에 있다";
        return answer;
    }
}