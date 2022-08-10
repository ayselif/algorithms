public class ShuffleAlgorithm {
    public int[] shuffle(int[] numbers, int limit) {
        int[] shuffledArray = new int[numbers.length];

        int counter = 0;
        for (int i = 0; i<limit; i++){
            shuffledArray[counter]= numbers[i];
            shuffledArray[counter + 1]= numbers[i + limit];
            counter += 2;
        }
        return shuffledArray;
    }
}
