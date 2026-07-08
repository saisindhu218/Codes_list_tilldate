class Solution {
    public boolean isThree(int n) {
        int check = 1;
        int count = 0;
        if ( n == 0 ){
            return false;
        }
        for ( int i = 1; i <= n; i++){
            if ( i *i == n) {
                check = i;
            }
        }
        for ( int j = 1; j <= check; j++ ){
            if ( check % j == 0 ){
                count++;
            }
        }

        if ( count == 2 ){
            return true;
        }else{
            return false;
        }
    }
}









