package two_pointers.medium;

import java.util.HashMap;

public class TwoSum_II_InputSorted {

        public static void main(String[] args) {
            int[] nums = {2, 7, 11, 15};
            int target = 9;
            int[] result = twoSumTwoPointers(nums, target);
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        }

        public static int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    return new int[]{map.get(complement)+1, i+1};
                }
                map.put(nums[i], i);
            }
            return new int[]{};
        }

    public static int[] twoSumTwoPointers(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

}
