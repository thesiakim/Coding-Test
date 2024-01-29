import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        
        switch(n) {
            case 1:
                for(int i=0; i<=slicer[1]; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 2:
                for(int i=slicer[0]; i<num_list.length; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 3:
                for(int i=slicer[0]; i<=slicer[1]; i++) {
                    list.add(num_list[i]);
                }
                break;
            case 4:
                for(int i=slicer[0]; i<=slicer[1]; i+=slicer[2]) {
                    list.add(num_list[i]);
                }
                break;
        }
        int[] result = new int[list.size()];
        int size = 0;
        
        for(int num : list) {
            result[size++] = num;
        }
        return result;
    }
}