class Solution {
    public boolean isPalindrome(int x) {
       int temp = x;
       int answer = 0;
       if(x == 0){
        return true;
       }
       if(x < 0){
        return false;
       }
       while(temp > 0){
        int digit = temp % 10;
        temp = temp / 10;
        answer = answer * 10 + digit;
       } 
       if(answer == x){
        return true;
       }else{
        return false;
       }
    }
}