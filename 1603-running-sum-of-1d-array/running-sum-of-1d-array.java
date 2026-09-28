class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int i=0;
        while( i<nums.length ){
            int sum =0;
            int j=0;
            while( j<=i){
                sum = sum + nums[j];
                j++;
            }
            result[i] = sum;
            i++;
        }
        return result;
    }
}