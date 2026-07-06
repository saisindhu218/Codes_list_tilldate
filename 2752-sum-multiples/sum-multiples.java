class Solution {
    public int sumOfMultiples(int n) {
        int answer = 0;
        int i = 1;
        while(i <= n){
            if(i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
                answer = answer + i;
            }
            i++;
        }
        return answer;
    }
}