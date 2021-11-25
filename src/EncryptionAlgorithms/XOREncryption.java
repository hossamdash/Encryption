package EncryptionAlgorithms;

public class XOREncryption
{
    // The same function is used to encrypt and
    // decrypt
    public static String encryptDecrypt(String inputString,String key)
    {
        // Define XOR key
        // Any character value will work
        char xorKey = key.charAt(0);

        // Define String to store encrypted/decrypted String
        String outputString = "";

        // calculate length of input string
        int len = inputString.length();

        // perform XOR operation of key
        // with every caracter in string
        for (int i = 0; i < len; i++)
        {
            outputString = outputString +
                    (char) (inputString.charAt(i) ^ xorKey);
        }

        System.out.println(outputString);
        return outputString;
    }
}