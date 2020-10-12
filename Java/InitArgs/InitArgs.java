public class InitArgs {
    public static void main(String args[]) {
        if (args.length != 3) {
            System.out.println(
                "Error: Please re-enter the entire command, including\n" +
                "an array size, initial value and increment.");
            return;
        }
        int arrayLength = Integer.parseInt(args[0]);
        int array[] = new int[arrayLength];

        int initialValue = Integer.parseInt(args[1]);
        int increment = Integer.parseInt(args[2]);

        for (int counter = 0; counter < arrayLength; ++counter) {
            array[counter] = initialValue + increment * counter;
        }

        System.out.printf("%s%8s\n", "Index", "Value");

        for (int counter = 0; counter < arrayLength; ++counter) {
            System.out.printf("%5d%8d\n", counter, array[counter]);
        }
    }    
}
