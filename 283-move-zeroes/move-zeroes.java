class Solution {
    public void moveZeroes(int[] nums) {
        int write = 0;
        int read = 0;

        while( read <= nums.length-1 ){
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