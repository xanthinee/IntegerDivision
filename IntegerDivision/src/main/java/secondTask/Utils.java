package secondTask;

public class Utils {

    public static int[] getDigits(int div) {

        String numberStr = Integer.toString(div);
        int[] digits = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = numberStr.charAt(i) - '0';
        }
        return digits;
    }

    public static String repeat(String s, int n) {

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static int lineSize (int num) {
        return Integer.toString(num).length();
    }
}