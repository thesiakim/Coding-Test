class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        int i = 0;
        int a = k;
        
        while(n >= a) {
            answer[i] = a;
            a += k;
            i++;
        }
        return answer;
    }
}