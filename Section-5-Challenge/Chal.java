import java.util.regex.MatchResult;

public class Chal {
    public static void main(String[] args) {
        double test1 = 1.5;
        double test2 = 10.25;
        double test3 = -5.6;
        double test4 = 25.42;
        double test5 = 75.114;

        long result1 = toMilesPerHour(test1);
        long result2 = toMilesPerHour(test2);
        long result3 = toMilesPerHour(test3);
        long result4 = toMilesPerHour(test4);
        long result5 = toMilesPerHour(test5);

        System.out.printf("Results are: %d, %d, %d, %d, %d%n", result1, result2, result3, result4, result5);
        printConversion(test1);
        printConversion(test2);
        printConversion(test3);
        printConversion(test4);
        printConversion(test5);

    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            double result =  kilometersPerHour * (0.621371);
            long rounded = Math.round(result);
            return rounded;
        }
    }
    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");;
        }
    }
}
