package EncryptionAlgorithms;

import Utility.RemoveDuplicates;

import java.util.ArrayList;
import java.util.Arrays;

public class PlayFair {
    final static int keyLength = 5;
    //  ================  instance variables ==========
    private static char[][] keyMatrix2D;
    String key, plainText, cipheredText;

    /*public PlayFair() {
        key = "default";
        plainText = "this is the text to be encrypted";
        cipheredText = "";
    }*/


//    public static ArrayList<Integer> storeSpaces(String text) {
//        ArrayList<Integer> spacePosition = new ArrayList<Integer>();
//        int i = 0;
//        for (char currentChar : text.toCharArray()) {
//            if (currentChar == ' ') {
//                spacePosition.add(i);
//            }
//            i++;
//        }
//        return spacePosition;
//    }
//

    //  ============  methods ================
    public static String prepText(String text) {
        return text.toLowerCase().replaceAll(" ", "").replaceAll("j", "");
    }

    public static char[][] keyBuild(String key) {
        key = key.toLowerCase();
        key = RemoveDuplicates.removeDuplicates(key);
        key = key.replaceAll(" ", "");
        key = key.replaceAll("j", "");
        int position = 0;
        char[] keyMatrix1D = new char[keyLength * keyLength];
        for (int i = 0; i < key.toCharArray().length; i++)
        {
            keyMatrix1D[i] = key.charAt(i);
            position++;
        }
        for (char i = 'a'; i <= 'z'; i++)
        {
            if (i == 'j') continue;
            boolean check = true;
            for (int j = 0; j < position; j++)
            {
                if (keyMatrix1D[j] == i)
                {
                    check = false;
                    break;
                }
                else
                    check = true;
            }
            if (check == true)
            {
                keyMatrix1D[position] = i;
                position++;
            }
        }
        keyMatrix2D = new char[keyLength][keyLength];
        for (int i = 0; i < keyLength; i++)
        {
            for (int j = 0; j < keyLength; j++)
            {
                keyMatrix2D[i][j] = keyMatrix1D[5 * i + j];
            }
        }
        System.out.println(Arrays.deepToString(keyMatrix2D));
        return keyMatrix2D;
    }

    public static String[] toPairs(String plainText) {
        plainText = prepText(plainText);
        StringBuilder plaintextBuilder = new StringBuilder(plainText);
        for (int i = 0; i < plaintextBuilder.length() - 1; i += 2)
        {
            char c1 = plaintextBuilder.charAt(i);
            char c2 = plaintextBuilder.charAt(i + 1);

            if (c1 == c2)
            {
                if (c1 == 'x')
                {
                    plaintextBuilder.insert(i + 1, 'z');
                } else
                {
                    plaintextBuilder.insert(i + 1, 'x');
                }
            }
        }

        if (plaintextBuilder.length() % 2 != 0)
        {
            if (plaintextBuilder.charAt(plaintextBuilder.length() - 1) == 'x')
            {
                plaintextBuilder.append('z');
            } else
            {
                plaintextBuilder.append('x');
            }
        }
        char c1 , c2 ;
        String[] resultArray;
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < plaintextBuilder.length() - 1; i += 2)
        {
            c1 = plaintextBuilder.charAt(i);
            c2 = plaintextBuilder.charAt(i + 1);
            result.add(String.valueOf(c1) + String.valueOf(c2));
        }
        resultArray = new String[result.size()];
        resultArray = result.toArray(resultArray);
        return resultArray;
    }

    static int[] findPosition(char[][] matrix, char c) {
        for (int i = 0; i < keyLength; i++)
        {
            for (int j = 0; j < keyLength; j++)
            {
                if (matrix[i][j] == c)
                    return new int[]{i, j};
            }
        }
        return new int[]{};
    }


    public static String cryptS(String plainText, String key, int value) {
        StringBuilder result = new StringBuilder();
        for (String w : plainText.split(" "))
        {
            result.append(crypt(w, key, value));
            result.append(" ");
        }
        return result.toString();
    }

    public static String crypt(String plainText, String key, int value) {

        String[] pairs = toPairs(plainText);
        char[][] keyMatrix = keyBuild(key);
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < pairs.length; i += 1)
        {
            char c1 = pairs[i].charAt(0);
            char c2 = pairs[i].charAt(1);
            int[] pos1 = findPosition(keyMatrix, c1);
            int[] pos2 = findPosition(keyMatrix, c2);
            char res1, res2;
            if (pos1[0] == pos2[0])
            {
                res1 = keyMatrix[pos1[0]][(pos1[1] + value + 5) % keyLength];
                res2 = keyMatrix[pos2[0]][(pos2[1] + value + 5) % keyLength];
            } else if (pos1[1] == pos2[1])
            {
                res1 = keyMatrix[(pos1[0] + value + 5) % keyLength][pos1[1]];
                res2 = keyMatrix[(pos2[0] + value + 5) % keyLength][pos2[1]];
            } else
            {
                res1 = keyMatrix[pos1[0]][pos2[1]];
                res2 = keyMatrix[pos2[0]][pos1[1]];
            }
            output.append(res1);
            output.append(res2);
        }
        return output.toString();
    }


    public static String encrypt(String plainText, String key) {
        return cryptS(plainText, key, 1);
    }

    public static String decrypt(String cipheredText, String key) {
        return cryptS(cipheredText, key, -1);
    }

}