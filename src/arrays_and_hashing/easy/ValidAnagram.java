package arrays_and_hashing.easy;

public class ValidAnagram {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
        String cat = "cat";
        String bat = "bat";
        System.out.println(isAnagram(cat, bat));
    }
    public static  boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            freq[c - 'a']--;
        }
        for (int f : freq) {
            if (f != 0) {
                return false;
            }
        }

        return  true;
    }
}
