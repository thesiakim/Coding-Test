class Solution {
    public int solution(int a, int b) {
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        
        int answer1 = Integer.parseInt(str1 + str2);
        int answer2 = 2*a*b;
        
        return (answer1 >= answer2) ? answer1 : answer2;
    }
}