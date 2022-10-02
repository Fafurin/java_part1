package Lesson_one_seminar;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int copyIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[copyIndex] = nums[i];
                copyIndex++;
            }
        }
        while (copyIndex < nums.length) {
            nums[copyIndex] = 0;
            copyIndex++;
        }
    }
}
