package Lesson_one_hw;

public class ReverseWordsInString {
    public static void main(String[] args) {
        System.out.println(reverseWords("one two"));
    }

    public static String reverseWords(String s) {
        StringBuilder newS = new StringBuilder();
        int end = s.length() - 1;

        while (end >= 0) {
            if (s.charAt(end) == ' ') {
                end -= 1;
                continue;
            }
            int start = end - 1;
            while (start >= 0 && s.charAt(start) != ' ') {
                start -= 1;
            }
            newS.append(" ");
            newS.append(s.substring(start + 1, end + 1));
            end = start - 1;
        }
        if (newS.length() > 0) {
            newS.deleteCharAt(0);
        }
        return newS.toString();
    }
}
