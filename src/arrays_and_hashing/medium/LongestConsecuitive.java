package arrays_and_hashing.medium;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LongestConsecuitive {
    /*A consecutive sequence is a sequence of elements in which each element is exactly 1 greater than the previous element.
    The elements do not have to be consecutive in the original array.
    You must write an algorithm that runs in O(n) time.*/
    public static void main(String[] args) {
        int[] nums = {4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3};

        System.out.println(longestConsecutive(nums));
     }
    public static int longestConsecutive(int[] nums) {
        Set<Integer> numbers = new TreeSet<>();
        for(int n : nums){
            numbers.add(n);

        }
        System.out.println(numbers);
        int current;
        int longest = 0;
        for(int n : numbers){
            System.out.println(n);
            if(numbers.contains(n - 1)) {continue;}
            current = 1;
            while(numbers.contains(n + current)){current++;}
            longest = Math.max(longest, current);

        }
        return longest;
    }
}
