package Lesson_one_hw;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        String newS = s.toLowerCase().replaceAll("\\s","");
        int left = 0;
        int right = newS.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(newS.charAt(left))){
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(newS.charAt(right))){
                right--;
            }
            char leftChar = newS.charAt(left);
            char rightChar = newS.charAt(right);

            if (left < right && leftChar != rightChar) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
