import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[numbers.length];
            //복사하고자 하는 범위만 지정해서 복사(복사하고자 하는 배열,시작 인덱스,배열의 크기)
            answer = Arrays.copyOfRange(numbers,num1,num2+1);
        return answer;
    }
}