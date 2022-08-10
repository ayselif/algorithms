import java.util.Arrays;

public class RemoveDuplicateElementAlgorithm {
    public int remove(int[] nums){
        int count = 1;
        int lastMovedNum = 0;

        for (int i=0; i<nums.length-1; i++){
            int currentNumber = nums[i];

            for (int j = i+1; j <= nums.length-1; j++) {
                int nextCount = nums[j];

                if(nextCount > currentNumber){
                    nums[i+1] = nextCount;
                    lastMovedNum = nextCount;
                    count += 1;
                    break;
                }
            }

            if (lastMovedNum >= nums[nums.length - 1]) {
                break;
            }
        }

        return count;
    }
}