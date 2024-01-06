class Solution {
    public int solution(int[] num_list) {
        String odd = "";
        String even = "";
        
        for(int i=0; i<num_list.length; i++) {
            even = (num_list[i] % 2 == 0) ? even + Integer.toString(num_list[i]) : even;
            odd = (num_list[i] %2 != 0) ? odd + Integer.toString(num_list[i]) : odd;
        }
        return Integer.parseInt(odd) + Integer.parseInt(even);
    }
}