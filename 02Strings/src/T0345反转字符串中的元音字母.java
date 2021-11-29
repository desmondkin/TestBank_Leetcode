import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class T0345反转字符串中的元音字母 {
    public static String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int i = 0, j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i < j) {
            if (!vowels.contains(chars[i])) {
                ++i;
                continue;
            }
            if (!vowels.contains(chars[j])) {
                --j;
                continue;
            }
            char t = chars[i];
            chars[i] = chars[j];
            chars[j] = t;
            ++i;
            --j;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
}
