class Solution {
    public int smallestEvenMultiple(int n) {
        int answer = 1;
     if(n % 2 == 0){
         answer = n;
     }
     if(n % 2 != 0){
        answer = n*2;
     }
     return answer;
    }
}