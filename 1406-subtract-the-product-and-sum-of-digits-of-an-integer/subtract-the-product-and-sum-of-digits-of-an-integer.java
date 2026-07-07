class Solution {
    public int subtractProductAndSum(int n) {
     int ori = n;
     int prod = 1;
     int sum = 0;
     while(ori>0){
        int digit = ori % 10;
        ori = ori / 10;
        prod = prod * digit;
        sum = sum + digit;
     }
     int diff = prod - sum;
     return diff;
    }
}