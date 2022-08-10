import java.util.ArrayList;
import java.util.List;

public class ParenthesesCombineAlgorithm {

    public List<String> generateParenthes(int n) {
        List<String> parenthesesCombineList = new ArrayList();
        parenthesesAddHelper(parenthesesCombineList,"", 0,0,n);
        return parenthesesCombineList;
    }

    private void parenthesesAddHelper(List<String> combineList, String currentParenthesLook, int openParenthesCount, int closedParenthesCount, int limit){
        if(currentParenthesLook.length() == limit * 2){
            combineList.add(currentParenthesLook);
        }

        if(openParenthesCount < limit){
            parenthesesAddHelper(combineList,currentParenthesLook+"(",openParenthesCount+1, closedParenthesCount, limit);
        }

        if(closedParenthesCount < openParenthesCount){
            parenthesesAddHelper(combineList,currentParenthesLook + ")",openParenthesCount,closedParenthesCount+1,limit);
        }
    }
}
