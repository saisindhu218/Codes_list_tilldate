class Solution {
    public boolean isPowerOfFour(int n) {
      int check = n;

      if ( n <= 0){
        return false;
      }  

      if ( n == 1 ){
        return true;
      }

      if ( n % 4 == 0 ){
        while ( check > 1 ){
            check = check / 4;
            if ( check == 1 ){
                return true;
            }
            if ( check % 4 != 0 ){
                return false;
            }
        }
        return true;
      }else{
        return false;
      }
    }
}