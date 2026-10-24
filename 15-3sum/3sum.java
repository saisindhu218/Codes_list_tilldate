import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            Set<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {

                int need = -nums[i] - nums[j];

                if (seen.contains(need)) {
                    result.add(Arrays.asList(nums[i], need, nums[j]));
                }

                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(result);
    }
}