public class Chal5 {
    public static void main(String[] args) {
        double test1 = 0.113432;
        double test2 = 0.114;
        boolean result = areEqualByThreeDecimalPlaces(test1, test2);
        System.out.printf("%f is equal to %f?: %b", test1, test2, result);
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        long num1l = (long) (num1 * 1000);
        long num2l = (long) (num2 * 1000);
        if (num1l == num2l) {
            return true;
        } else {
            return false;
        }
    }
}
