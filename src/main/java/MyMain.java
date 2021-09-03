public class MyMain {
    // Adds 5 to the given integer
    // This method has been written for you
    public static int add5(int x) {
        return (x + 5);
    }

    // Given three ints x, y, and z, this method
    // returns the largest of the three numbers
    public static int findBiggestNumber(int x, int y, int z) {
        // REPLACE THIS WITH YOUR CODE
        int a = 0;
        int b = 0;
        if(x>y) {
            a = x;
        }
        else {
            a = y;
        }
        if(a>z) {
            b = a;
        }
        else {
            b = z;
        }
        return (z);
    }

    // This method simulates the flip of a coin, where
    // true represents "heads" and false represents "tails"
    // This method should return true half the time, and false the other half
    public static boolean flipCoin() {
        // REPLACE THIS WITH YOUR CODE

//        if (Math.random() >= 0.5) {
//            return true;
//        }
//        else {
//            return false;
//        }

        return (Math.random()>=0.5);
    }

    // This method simulates the flip of a weighted coin,
    // that is a coin that is biased towards heads
    public static boolean flipWeightedCoin() {
        // REPLACE THIS WITH YOUR CODE
        return false;
    }

    // This method rounds a double to the nearest whole number
    public static int round(double d) {
        // REPLACE THIS WITH YOUR CODE
        int f = (int)d;
        double a = d -f;
        if ( a >= 0.5 ) {
            return(f + 1);
        }
        else {
            return(f);
        }
    }

    // This method returns a random number between 1 and 6, inclusive
    public static int rollDie() {
        // REPLACE THIS WITH YOUR CODE
        return (int) (Math.random() * 6) + 1;
    }

    // This method carries out the quadratic formula and *prints* out the answers
    public static void quadForm(int a, int b, int c) {
        return;
    }

    public static void main(String[] args) {
        // Test the add5 method
        int x = 2;
        int y = add5(x);
        System.out.println(y);

        // YOUR CODE HERE
        System.out.println(round(4.4));
        System.out.println(rollDie());
    }
}