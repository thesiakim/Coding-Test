class Solution {
    public int solution(int a, int d, boolean[] included) {
        int n = included.length;
        int[] array = new int[n];
        int sum = 0;
        
        for(int i=0; i<n; i++) {
             if (included[i]) {
                array[i] = a + d * i;
                sum += array[i];
            }
        }
        return sum;
    }
}