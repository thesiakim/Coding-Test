class Solution {
    public int[] solution(int[] arr, int[][] queries) {     
        
        for(int i=0; i<queries.length; i++) {
           int n1 = arr[queries[i][0]];
           int n2 = arr[queries[i][1]];
            
           arr[queries[i][0]] = n2;
           arr[queries[i][1]] = n1;
        }
        return arr;
    }
}