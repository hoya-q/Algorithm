class Solution {
    public int solution(int price) {
        int answer = price;
        
        if (answer >= 500000) {
            return (int) (answer * 0.8);
        } else if (answer >= 300000) {
            return (int) (answer * 0.9);
        } else if (answer >= 100000) {
            return (int) (answer * 0.95);
        } else {
            return answer;
        }
        
    }
}