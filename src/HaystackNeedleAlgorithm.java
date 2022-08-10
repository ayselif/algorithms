import java.awt.*;

public class HaystackNeedleAlgorithm {
    public Integer isTherePartOf (String haystack, String needle) {
        for (int i= 0; i<haystack.length() ; i++) {
            char currentLetter = haystack.charAt(i);
            if(currentLetter == needle.charAt(0)){
                String detectedString = this.getSubStr(haystack,i,needle.length());

                //String detectedString = haystack.substring(i,i+needle.length());
                // extra: substring using

               if (detectedString.equals(needle)) {
                   return 2;
               }
            }
        }
        return -1;
    }
    private String getSubStr(String word, int begin, int count) {
        String foundedWord = new String();

        for(int i = begin; i< begin+count; i++) {
            foundedWord += word.charAt(i);
        }

        return foundedWord;
    }

}