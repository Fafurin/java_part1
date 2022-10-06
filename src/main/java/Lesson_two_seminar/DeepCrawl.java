package Lesson_two_seminar;

public class DeepCrawl {
    public static void main(String[] args) {
        deepCrawl(1,13,4,2,"");
    }
    public static void deepCrawl(int src, int target, int mult, int add, String path) {
        if (src == target) {
            System.out.println(path);
            return;
        }

        if (src > target) {
            return;
        }

        deepCrawl(src * mult, target, mult, add, path + " k1");
        deepCrawl(src + add, target, mult, add, path + " k2");

    }
}
