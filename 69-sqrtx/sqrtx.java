class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int temp = 1;
        for(long i=1; i<=x; i++){ 
            if(i * i == x){
                return temp = (int) i;
            }else if(i * i > x){
                return temp = (int) i - 1;
            }
        }
     return temp;
    }
}