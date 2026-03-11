package arrays_and_hashing.medium;

import javax.swing.*;
import java.util.*;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.stream(nums).boxed().toList());
        int temporal = 0;
        for (int i = 0; i < nums.length; i++) {
            temporal = nums2.get(i);
            nums2.remove(i);
            res[i] = nums2.contains(0)
                    ? 0
                    : nums2.stream().reduce(1, (a, b) -> a * b);
            nums2.add(i, temporal);
        }
        return res;
    }
}
