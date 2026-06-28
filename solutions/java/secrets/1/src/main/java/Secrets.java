public class Secrets {
    public static int shiftBack(int value, int amount) {
       // throw new UnsupportedOperationException("Please implement the (static) Secrets.shiftBack() method");
        return value >>> amount;
    }

    public static int setBits(int value, int mask) {
        //throw new UnsupportedOperationException("Please implement the (static) Secrets.setBits() method");
        return value | mask;
    }

    public static int flipBits(int value, int mask) {
        //throw new UnsupportedOperationException("Please implement the (static) Secrets.flipBits() method");
        return value ^ mask;
    }

    public static int clearBits(int value, int mask) {
        //throw new UnsupportedOperationException("Please implement the (static) Secrets.clearBits() method");
        return value &~ mask;
    }
}