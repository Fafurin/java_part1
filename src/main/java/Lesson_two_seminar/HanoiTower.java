package Lesson_two_seminar;

public class HanoiTower {
    public static void main(String[] args) {
        hanoiTower(3, 1, 3, 2);
    }
    public static void hanoiTower(int n, int src, int target, int buffer) {
        if (n == 1) {
            System.out.printf("Диск 1 с %d на %d", src, target);
            System.out.println();
            return;
        }

        hanoiTower(n - 1, src, buffer, target);
        System.out.printf("Диск %d с %d на %d", n, src, target);
        System.out.println();
        hanoiTower(n - 1, buffer, target, src);
    }
}
