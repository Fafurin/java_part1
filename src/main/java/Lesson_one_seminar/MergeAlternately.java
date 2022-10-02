package Lesson_one_seminar;

public class MergeAlternately {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcd", "pq"));
    }

    public static String mergeAlternately(String word1, String word2) {
        int maxLength = Math.max(word1.length(), word2.length());
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            if (i < word1.length()) {
                res.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                res.append(word2.charAt(i));
            }
        }
        return res.toString();
    }
}
