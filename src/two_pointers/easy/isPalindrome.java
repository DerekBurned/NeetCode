package two_pointers.easy;

public class isPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
        System.out.println(isPalindrome("tab a cat"));
    }
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (s.contentEquals(new StringBuilder(s).reverse())){
            return  true;
        }
        return  false;

    }
}
