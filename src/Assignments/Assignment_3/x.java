package Assignments.Assignment_3;

public class x {
    static String binary(int k, String s) {
        if (k >= 1) {
            if (k % 2 == 0) {
                s = "0" + s;
            } else {
                s = "1" + s;
            }
            return binary( k / 2,s);
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "";
        System.out.println(binary(15,s));
    }
}
