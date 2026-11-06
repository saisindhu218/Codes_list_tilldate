class Solution {
    public void moveZeroes(int[] nums) {
        int write = 0;
        int read = 0;

        for(int i = 0; i <= nums.length-1; i++){
            if(nums[read] == 0){
               read++;
            }else{
                int temp = nums[read];
                nums[read] = nums[write];
                nums[write] = temp;

                write++;
                read++;
        }
        }
    }
}