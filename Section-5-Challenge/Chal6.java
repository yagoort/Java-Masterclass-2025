public class Chal6 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int num3 = 2;
        System.out.println(hasEqualSum(num1, num2, num3));
    }

    public static boolean hasEqualSum(int num1, int num2, int num3) {
        if (num1 + num2 == num3) {
            return true;
        } else {
            return false;
        }
    }
}
