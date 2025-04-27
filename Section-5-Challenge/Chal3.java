public class Chal3 {
    public static void main(String[] args) {
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            if (hourOfDay > 23 || hourOfDay < 0) {
                return false;
            } else if (hourOfDay > 22 || hourOfDay < 8) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
