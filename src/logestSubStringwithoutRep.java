import java.util.HashSet;
public class logestSubStringwithoutRep {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int longest = 0;
        int left = 0;
        int right = 0;
        HashSet<Character> set = new HashSet<>();

        while (right < n) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                longest = Math.max(longest, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
System.out.println(set);
        return longest;
    }

    public static void main(String[] args) {
        String str = "bbbbbbcbcccc";
        int length = lengthOfLongestSubstring(str);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
}
