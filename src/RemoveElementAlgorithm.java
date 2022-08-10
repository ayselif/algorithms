import java.util.Arrays;

public class RemoveElementAlgorithm {
    public int remove(int[] arr, int value) {
        int repeatedValueCount = 0;

        for(int i = arr.length-1; i>=0; i--) {
           int currentNumber = arr[i];
            if(arr[i] == value) {
               repeatedValueCount += 1;
               continue;
           } else {
               for(int j=0; j<i; j++){
                   if (arr[j] == value) {
                       arr[j] = currentNumber;
                       arr[i] = value;
                       repeatedValueCount += 1;
                       break;
                   }
               }
           }
        }

        return arr.length - repeatedValueCount;
    }
}
