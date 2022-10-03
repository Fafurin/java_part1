package Lesson_one_hw;

public class MergeSortedArray {
    public void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int lastEl = m + n - 1;
        m = m - 1;
        n = n - 1;

        while (n >= 0) {
            if (m >= 0 && nums1[m] > nums2[n]) {
                nums1[lastEl] = nums1[m];
                lastEl--;
                m--;
            } else {
                nums1[lastEl] = nums2[n];
                lastEl--;
                m--;
            }
        }
    }
}
