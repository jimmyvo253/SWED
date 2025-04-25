public class Ulam{
    public static boolean ulamSequence(long n) {
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int limit = 1_000_000;
        boolean allTerminate = true;

        for (int i = 1; i < limit; i++) {
            if (!ulamSequence(i)) {
                System.out.println("Sequence did not terminate for: " + i);
                allTerminate = false;
                break;
            }
        }

        if (allTerminate) {
            System.out.println(" All Ulam sequences for numbers < 1,000,000 terminated at 1.");
        } else {
            System.out.println(" Found a number that does not terminate.");
        }
    }
}