import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        List<Integer> l = new ArrayList();
        int p = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(i==0){
                l.add(arr[i]);
                p = arr[i];
                continue;
            } 
            
            if(p != arr[i]){
                p = arr[i];
                l.add(arr[i]);
            }
        }
        answer = new int[l.size()];
        int j = 0;
        for (int i : l){
            answer[j] = i;
            j++;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}