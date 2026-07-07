class Solution {
    public int countDigits(int num) {
    int ori = num;
    int count = 0;
    while(ori> 0){
        int digit = ori % 10;
        if((digit !=0) && (num % digit == 0)){
            count++;
        }
        ori = ori / 10;
    }
    return count;
    }
}