class Solution {
    public boolean isSameAfterReversals(int num) {
       int temp = num;
       int rev1 = 0;
       int rev2 = 0;

       while(temp>0){
         int digit = temp % 10;
         temp = temp / 10;
         rev1 = rev1 * 10 + digit;
       }

       while(rev1>0){
        int digit = rev1 % 10;
        rev1 = rev1 / 10;
        rev2= rev2 * 10 + digit;
       }

       if(rev2 == num){
        return true;
       }else{
        return false;
       }
    }
}