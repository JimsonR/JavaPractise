import java.util.ArrayList;
import java.util.Arrays;

public class Charat {
    public static void main(String[] args) {
        String s = "speed";
        char[] st = s.toCharArray();
        System.out.println(st);
        char[] chars = new char[s.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = s.charAt(i);
        }
        System.out.println(Arrays.toString(chars));
    }
}
