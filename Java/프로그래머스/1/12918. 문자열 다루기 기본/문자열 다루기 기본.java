class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int l =  s.length();
        
        if(l !=4 && l !=6){
            return false; 
        
        }
        String[] arr = s.split("");
        
         for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                  return false ;
                }
            }
        
        
        return answer;
    }
}