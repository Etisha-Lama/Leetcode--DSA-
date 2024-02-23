public class StringReversal {
    public static String reverseString(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Get the length of the array
        int length = charArray.length;

        // Iterate through half of the array and swap characters
        for (int i = 0; i < length / 2; i++) {
            // Swap characters at index i and length - 1 - i
            char temp = charArray[i];
            charArray[i] = charArray[length - 1 - i];
            charArray[length - 1 - i] = temp;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }

    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Reversed: " + reversed);
    }
}



