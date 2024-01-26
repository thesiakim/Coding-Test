import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(num_list);
        
        for(int i=5; i<num_list.length; i++) {
            result.add(num_list[i]);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
        
    }
}