import java.util.HashSet;
import java.util.Set;

public class TN0003无重复字符的最长子串 {
    public static int lengthOfLongestSubstring(String s){
        int ret = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0, j = 0; i < s.length(); i++){
            char c = s.charAt(i);
            while(set.contains(c)) {
                    set.remove(s.charAt(j));
                    j++;
            }
            set.add(c);
            ret = Math.max(ret,i - j + 1);
        }
        return ret;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
