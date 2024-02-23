import java.util.HashSet;
public class LongestSubstringWithoutRepeating {
    public static int lengthOfLongestSustring(String s) {
        if (s == null || s.length()==0){
            return 0;
        }

        int maxlenghth=0;
        int left=0;
        int right=0;

        HashSet<Character> uniqueChars= new HashSet<>();

        while (right<s.length()) {
            if (!uniqueChars.contains(s.charAt(right))) {
                uniqueChars.add(s.charAt(right));
            }
            else{
                uniqueChars.remove(s.charAt(left));
                left++;
            }            
        }
        return maxlenghth;
    }
    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = lengthOfLongestSustring(input);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}
