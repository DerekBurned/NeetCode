package arrays_and_hashing.easy;

import java.util.HashSet;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>(nums.length);
        for( int n : nums){
            if(!set.add(n)){
                return true;
            }
            set.add(n);
        }
        return false;
    }
}
