class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < n; i++) {
            hs.add(nums[i]);
        }

        for (int i = 0; i < n; i++) {
            if (hs.contains(target - nums[i])) {
                res[1] = i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (target - nums[res[1]] == nums[i] && res[1] != i){
                res[0] = i;
            }
        }

        return res;
    }
}
