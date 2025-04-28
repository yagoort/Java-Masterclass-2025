public class Chal7 {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 11; 
        int num3 = 19;
        System.out.println(hasTeen(num1, num2, num3));
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        return (13 <= num1 && num1 <= 19) ||
               (13 <= num2 && num2 <= 19) ||
               (13 <= num3 && num3 <= 19);
    }

    public static boolean isTeen(int num1) {
        return (13 <= num1 && num1 <= 19);
    }
}
