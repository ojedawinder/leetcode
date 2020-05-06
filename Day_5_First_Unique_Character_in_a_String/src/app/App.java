package app;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int firstUniqCharIndex = firstUniqChar("leetcode");
        System.out.printf("%s : %d %n", "leetcode", firstUniqCharIndex);

        firstUniqCharIndex = firstUniqChar("loveleetcode");
        System.out.printf("%s : %d %n", "loveleetcode", firstUniqCharIndex);

        firstUniqCharIndex = firstUniqChar("cc");
        System.out.printf("%s : %d %n", "cc", firstUniqCharIndex);

    }

    public static int firstUniqChar(String s) {

        if(s.length() == 0)
            return -1;

        int index = -1;
        String[] arrayChar = new String[s.length()];

        for(int i = 0 ; i < s.length();i++){
            String letter = String.valueOf(s.charAt(i));
            
            if(Arrays.asList(arrayChar).contains(letter)){
                arrayChar[i] =letter;
                continue;
            }
            
            arrayChar[i] =letter;
                     
            boolean isUnique = true;

            for(int j = i+1 ; j < s.length();j++){
                String letter2 = String.valueOf(s.charAt(j));
                if(letter.equalsIgnoreCase(letter2)){
                    isUnique = false;
                    break;
                }
                    
            }

            if(isUnique)
                return i;

        }
        return index;
    }
}