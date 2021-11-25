package EncryptionAlgorithms;

// Java program to decode NULL CIPHER
public class GFG {

    // Function to decode the message.
   public static String decode(String str) {
        // Store the decoded string
        String res = "";

        // found variable is used
        // to tell that the encoded
        // encoded character is
        // found in that particular word.
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            // Set found variable to false
            // whenever we find
            // whitespace, meaning that
            // encoded character for
            // new word is not found
            if (str.charAt(i) == ' ') {
                found = false;
                continue;
            }
            if (!found) {
                if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') ||
                        (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
                    res += Character.toString(str.charAt(i));
                    found = true;
                }
            }
        }
        return res.toLowerCase();
    }
}
// This code is contributed by Vivek Kumar Singh