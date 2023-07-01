class Solution {
    public int solution(int a, int b) {
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        
        int answer1 = Integer.parseInt(str1 + str2);
        int answer2 = Integer.parseInt(str2 + str1);
        
        if(answer1==answer2) {
            return answer1;
        } else if(answer1 > answer2) {
            return answer1;
        } else return answer2;
    }
}