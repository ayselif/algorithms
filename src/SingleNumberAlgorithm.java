import java.util.HashMap;

public class SingleNumberAlgorithm {
    public Integer findTheSingleNumber(int[] number) {
        HashMap<Integer, Boolean> singleNumber = new HashMap<Integer, Boolean>();

        for(int i= 0; i < number.length; i++) {
            int key = number[i];

            if (singleNumber.get(key) != null) {
                singleNumber.remove(key);
            } else {
                singleNumber.put(key, true);
            }
        }

        return singleNumber.keySet().stream().findFirst().get();
    }
}
