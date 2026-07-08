class Solution {
    public boolean isPowerOfTwo(int n) {
        int temp = n;
        if ( n <= 0){
            return false;
        }
        if ( n == 1 ){
            return true;
        }
        if ( n % 2 == 0 ){
           while (temp > 1){
            temp = temp / 2;
            if(temp == 1 ){
                return true;
            }
            if(temp % 2 != 0){
                return false;
           }
        }
        return true;
        }else{
            return false;
        }
    }
}