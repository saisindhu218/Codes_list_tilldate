class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int rev = 0;

        if ( x == 0){
            return true;
        }

        if ( x < 0 ){
            return false;
        }
 
       while ( original >= 1){
            int digit = original % 10;
            original = original / 10;
            rev = rev * 10 + digit;
       }

       if ( rev == x){
        return true;
       }else{
        return false;
       }
    }
}