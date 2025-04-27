public class Chal4 {
    public static void main(String[] args) {
        int test1 = 2000;
        int test2 = 2004;
        int test3 = 2008;
        int test4 = 2012;
        int test5 = 2011;

        System.out.printf("%d Is a leap year? :%b%n", test1, isLeapYear(test1));
        System.out.printf("%d Is a leap year? :%b%n", test2, isLeapYear(test2));
        System.out.printf("%d Is a leap year? :%b%n", test3, isLeapYear(test3));
        System.out.printf("%d Is a leap year? :%b%n", test4, isLeapYear(test4));
        System.out.printf("%d Is a leap year? :%b%n", test5, isLeapYear(test5));
    }
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
