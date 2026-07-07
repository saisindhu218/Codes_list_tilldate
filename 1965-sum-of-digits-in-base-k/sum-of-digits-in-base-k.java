class Solution {
    public int sumBase(int n, int k) {
    int ori = n;
    int sum = 0;
    while(ori>0){
        int digit = ori % k;
        ori = ori / k;
        sum = sum + digit;
    }
    return sum;
    }
}