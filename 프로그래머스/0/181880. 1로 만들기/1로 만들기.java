class Solution {
    public int solution(int[] num_list) {
        int result = 0;
        
        for(int i=0; i<num_list.length; i++) {
            result += makeOne(num_list[i]);
        }
        return result;
    }
    
    private int makeOne(int num) {
        int count = 0;
        while(num > 1) {
            if(num % 2 == 0) {
                num = num/2;
                count++;
            } else {
                num = (num-1)/2;
                count++;
            }
        }
        return count;
    }
}