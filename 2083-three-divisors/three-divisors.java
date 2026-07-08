class Solution {
    public boolean isThree(int n) {
        int check = 0;
        int count = 0;
        if ( n == 0 ){
            return false;      // if number is 0 
        }

        for ( int i = 1; i <= n; i++){
            if ( i * i == n) {            // this loop is to identify square root of num
                check = i;              // i.e if num = 25      5 * 5 = 25
                break;
            }                            // so 5 is squareroot of 25
            if ( i * i > n ){
                return false;            // this is imp like if sometimes root is smalled than the i 
            } 
        }

        for ( int j = 1; j <= check; j++ ){
            if ( check % j == 0 ){
                count++;                        // this loop is to check if the root is 
            }                                   // prime or not as prime has 2 divisors but its
        }                                       // square has 3 divisors

        if ( count == 2 ){
            return true;
        }else{
            return false;
        }
    }
}









