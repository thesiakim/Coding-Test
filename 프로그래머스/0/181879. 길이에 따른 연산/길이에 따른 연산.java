import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int result = 0;
        
        if(num_list.length>=11) {
            result = Arrays.stream(num_list).sum();
        } else if(num_list.length<=10) {
            result = Arrays.stream(num_list).reduce(1, (a,b)->a*b);
            }
        return result;
        }
    }
