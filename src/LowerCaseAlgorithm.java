public class LowerCaseAlgorithm {
    public String lowerCase(String word) {   // HeLlO
        char[] lowerLetters = new char[word.length()];
        int newIndex= 0;

        for(int i= 0; i< word.length(); i++) {
            char[] charArray = word.toCharArray(); // H e L l O

            if(charArray[i] >= 'A' && charArray[i] <= 'Z'){
                lowerLetters[newIndex] = (char)(charArray[i] + 32);
            } else {
                lowerLetters[newIndex] = charArray[i];
            }
            newIndex++;
        }

        return new String(lowerLetters);
    }
}
