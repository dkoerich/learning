import java.util.Random;

public class InitArray {
    public static void main(String args[]) {
        final int ARRAY_LENGTH = 10;
        /*
        int array[];
        array = new int[ARRAY_LENGTH];
        */
        int array[] = new int[ARRAY_LENGTH];

        Random randomizer = new Random(ARRAY_LENGTH);
        final int RANDOM_MAX = 100;

        // Must use a regular 'for' to modify array elements
        for (int i = 0; i < ARRAY_LENGTH; ++i) {
            array[i] = randomizer.nextInt(RANDOM_MAX);
        }

        // Can use an enhanced 'for' to inspect array elements
        for (int val : array) {
            System.out.printf("%d ", val);
        }
        System.out.println();
    }    
}
