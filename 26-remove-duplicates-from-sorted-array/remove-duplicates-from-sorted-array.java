class Solution {
    public int removeDuplicates(int[] nums) {
        int n = 1;
        int first = 0;
        int second = 1;

        while( second < nums.length){

            if(nums[first] == nums[second]){
                second++;
            }else{
                first++;
                nums[first] = nums[second];
                n++;
            }
        }
        return n;
    }
}