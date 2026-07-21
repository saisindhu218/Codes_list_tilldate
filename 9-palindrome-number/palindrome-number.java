class Solution {
    public boolean isPalindrome(int x) {
        int same = x;
        int rev = 0;

        if ( x == 0){
            return true;
        }

        if( x <= 0 ){
            return false;
        }

        while ( same > 0 ){
            int digit = same % 10;
            same = same / 10;
            rev = rev * 10 + digit;
        }

        if ( rev == x ){
            return true;
        }else{
            return false;
        }
    }
}