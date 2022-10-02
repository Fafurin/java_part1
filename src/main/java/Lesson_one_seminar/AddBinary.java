package Lesson_one_seminar;

public class AddBinary {
    public String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            return addBinary(b, a);
        }

        int j = b.length() - 1;
        int carry = 0;
        StringBuilder res = new StringBuilder();

        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1') {
                carry++;
            }

            if (j >= 0 && b.charAt(j) == '1') {
                carry++;
            }

            res.append(carry % 2);
            carry /= 2;
            j--;
        }

        if (carry == 1) {
            res.append(1);
        }
        return res.reverse().toString();
    }
}
