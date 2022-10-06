package Lesson_two_seminar;

public class Pow {
    public static void main(String[] args) {
        System.out.println(pow(10,2));
        System.out.println(pow(10,3));
        System.out.println(pow(10,-2));
    }
    public static double pow(double base, int pow) {
        if (pow == 1) {
            return base;
        }
        if (pow == 0) {
            return 1;
        }
        if (pow < 0) {
            return pow(1/base, -pow);
        }
        double sqrt = pow(base, pow/2);
        double res = sqrt * sqrt;
        if (pow % 2 == 1) {
            res *= base;
        }
        return res;
    }
}
