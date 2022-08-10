import java.util.*;
import java.util.Stack;

public class PrimeNumberAlgorithm {
    public Integer findNthPrimeNumber(int target) {
        int prime = 2;
        int i = 0;
        int result = 0;

        while (i < target) {
            if (this.isPrime(prime)) {
                result = prime;
                prime++;
                i++;
            } else {
                prime++;
            }
        }
        return result;
    }

    private boolean isPrime(int number) {
        boolean result = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}
