public class Increment {
    private int total = 0;
    private final int INCREMENT; // initialize here OR in (all) constructor(s)

    public Increment(int incrementValue) {
        INCREMENT = incrementValue;
    }

    /*
    protected void finalize() {
        System.out.printf("Finalizing Increment (%d) object\n", INCREMENT);
    }
    */

    public void addIncrementToTotal() {
        total += INCREMENT;
    }

    public String toString() {
        return String.format("total = %d", total);
    }
}
