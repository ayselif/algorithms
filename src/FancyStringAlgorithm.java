public class FancyStringAlgorithm {
    public String makeFancy(String word) {
        String fancyStack = new String();
        fancyStack += word.charAt(0);

        int lastLetterRepeatCount = 1;
        int limit = 2;

        for(int i = 0; i < word.length(); i++) {
            char currentLetter = word.charAt(i);
            char lastLetterOfFancy = fancyStack.charAt(fancyStack.length() - 1);

            if((lastLetterOfFancy == currentLetter) && lastLetterRepeatCount < limit) {
                fancyStack += currentLetter;
                lastLetterRepeatCount += 1;
            } else if (lastLetterOfFancy != currentLetter) {
                fancyStack += currentLetter;
                lastLetterRepeatCount = 1;
            }
        }

        return fancyStack;
    }
}
