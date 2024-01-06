class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] result = new int[length+1];
        
        for(int i=0; i<length; i++) {
                result[i] = num_list[i];
            }
            
        if (num_list[length-1] > num_list[length-2]) {
            result[length] = num_list[length-1]-num_list[length-2];
        } else {
            result[length] = num_list[length-1]*2;
        }
        return result;
    }
}