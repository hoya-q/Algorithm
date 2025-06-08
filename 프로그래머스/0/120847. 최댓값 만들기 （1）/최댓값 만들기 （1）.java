import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        
        // 배열을 오름차순으로 정렬
        Arrays.sort(numbers);
        
        int answer = numbers.length;
        answer = numbers[answer - 1] * numbers[answer - 2];
        
        return answer;
    }
}