class Solution {
    public int alternateDigitSum(int n) {
       int temp = n;
       int count = 0;
       int sum = 0;
       while(n>0){
        int digit = n % 10;
        n = n / 10;
        count++;
       } 
       while(temp>0){
        int digit = temp % 10;
        temp = temp / 10;
        if(count % 2 != 0){
            sum = sum + digit;
        }else{
            sum = sum - digit;
        }
         count--;
       }
     return sum;
    }
}