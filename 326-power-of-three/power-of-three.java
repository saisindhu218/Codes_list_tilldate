class Solution {
    public boolean isPowerOfThree(int n) {
        int check = n;
        if ( n <= 0 ){
            return false;
        }
        if ( n == 1){
            return true;
        }

        if ( n % 3 == 0){
            while ( check > 1){
            check = check / 3;
            if ( check == 1 ){
                return true;
            }
            if ( check % 3 != 0){
               return false;
            }
            }
            return true;
        }else{
            return false;
        }

    }
}