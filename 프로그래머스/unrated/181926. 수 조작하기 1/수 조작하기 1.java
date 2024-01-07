class Solution {
    public int solution(int n, String control) {
        char[] arr = control.toCharArray();
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 'w') n = n+1;
            else if(arr[i] == 's') n = n-1;
            else if(arr[i] == 'd') n = n+10;
            else n = n-10;
        }
        return n;
    }
}