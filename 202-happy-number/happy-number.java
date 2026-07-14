class Solution {
    public boolean isHappy(int n) {
        List<Integer> answer= new ArrayList<>();
        while ( n != 1){
              int sum = 0;
        while ( n >= 1 ){
           int digit = n % 10;
           n = n / 10;
           sum = sum + (digit * digit);
        }
           if ( answer.contains(sum)){
            return false;
           }
           answer.add(sum);
           n = sum;
        }
     return true;      
    }
} 