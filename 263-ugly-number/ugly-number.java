class Solution {
    public boolean isUgly(int n) {
        int check = n;
        if ( n == 1){
            return true;
        }
        if ( n <= 0 ){
            return false;
        }

        while ( check > 1 ){
        if ( check % 2 == 0){
            check = check / 2;
            // continue;
        }else 
        if ( check % 3 == 0){
           check =  check / 3;
        //    continue;
        }else
        if( check % 5 == 0){
            check = check / 5;
            // continue;
        }else{
            return false;
        } 
        }
        return true;
    }
}