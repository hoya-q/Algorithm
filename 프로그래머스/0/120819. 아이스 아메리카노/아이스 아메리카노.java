class Solution {
    public int[] solution(int money) {
        int count = money / 5500;
        int changeMoney = money % 5500;
        
        int[] answer = {count, changeMoney};
        
        return answer;
    }
}