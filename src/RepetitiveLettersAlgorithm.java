import java.util.ArrayList;

public class RepetitiveLettersAlgorithm {
    public char findNonRepeatLetters(String word){
        ArrayList<Character> letterList = new ArrayList<Character>();
        for(int index = 0; index < word.length(); index++) {
            boolean isRepeated = false;
            char currentLetter = word.charAt(index);

            for (int i = 0; i<word.length(); i++){
                if( currentLetter == word.charAt(i) && i != index ) {
                    isRepeated = true;
                }
            }

            if (!isRepeated) {
                letterList.add(currentLetter);
            }
        }

        if (letterList.size() == 0) {
            return ' ';
        }
        return letterList.get(0);
    }
}
