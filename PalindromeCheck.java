public class PalindromeCheck {
    public static boolean isPalindrome(String str){
        str= str.replaceAll("\\s","").toLowerCase();
        int left=0;
        int right=str.length()-1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String palindromeStr= "maam teaching";

        if (isPalindrome(palindromeStr)){
            System.out.println(palindromeStr + " is a Palindrome.");
        }
        else{
            System.out.println(palindromeStr + " is not a Palindrome.");
        }
    }
}


// public class PalindromeCheck {

    // public static boolean isPalindrome(int x) {
    //     if (x < 0) {
    //         return false; // Negative numbers are not palindromic
    //     }

    //     int original = x;
    //     int reversed = 0;

    //     while (x != 0) {
    //         int digit = x % 10;
    //         reversed = reversed * 10 + digit;
    //         x /= 10;
    //     }

    //     return original == reversed;
    // }

    
//     public static void main(String[] args) {
//         int num = 121;

//         if (isPalindrome(num)) {
//             System.out.println(num + " is a palindrome.");
//         } else {
//             System.out.println(num + " is not a palindrome.");
//         }
//     }
// }
