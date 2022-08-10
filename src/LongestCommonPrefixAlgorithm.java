
public class LongestCommonPrefixAlgorithm {
    public String longestCommonPrefix(String[] words) {
        String sameLetters = new String();
        Boolean isEnd = false;

        char lastTargetLetter = ' ';

        while (isEnd == false){
            for(int i=0; i<words.length; i++){
                String currentWord = words[i]; // flower

                if (sameLetters.length() >= currentWord.length()) {
                    isEnd = true;
                    break;
                }
                char currentChar = currentWord.charAt(sameLetters.length());

                if (i == 0) {
                    lastTargetLetter = currentChar;
                }

                if (currentChar != lastTargetLetter) {
                    isEnd = true;
                    break;
                }

                if (i == words.length - 1) {
                    sameLetters += lastTargetLetter;
                }
            }
        }
        return  sameLetters;
    }
}
