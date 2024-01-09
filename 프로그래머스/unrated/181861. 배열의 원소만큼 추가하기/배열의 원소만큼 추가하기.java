import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i]; j++) {
                list.add(arr[i]);
            }
        }
        
        int[] result = new int[list.size()];
        int size = 0;
        for(int temp : list) {
            result[size++] = temp;
        }
        return result;
    }
}