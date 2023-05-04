
import java.util.Scanner;

public class Calculator {
    public static String[] romanNumbers = {"there is no number", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII",
            "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII",
            "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII",
            "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII",
            "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV",
            "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV",
            "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV",
            "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII",
            "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toUpperCase();
        int result, result2;
        String[] data;

        if (!str.contains("+") && !str.contains("-") && !str.contains("*") && !str.contains("/")) {
            throw new Exception("//т.к. строка не является математической операцией");
        }

        try {
            if (str.contains("+")) {
                data = str.split("\\+");
                result = Integer.parseInt(data[0]);
                result2 = Integer.parseInt(data[1]);
                if (result >= 1 && result <= 10 && result2 >= 1 && result2 <= 10)
                    System.out.println(result + result2);
                else
                    System.out.println("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.");
            } else if (str.contains("-")) {
                data = str.split("-");
                result = Integer.parseInt(data[0]);
                result2 = Integer.parseInt(data[1]);
                if (result >= 1 && result <= 10 && result2 >= 1 && result2 <= 10)
                    System.out.println(result - result2);
                else
                    System.out.println("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.");
            } else if (str.contains("*")) {
                data = str.split("\\*");
                result = Integer.parseInt(data[0]);
                result2 = Integer.parseInt(data[1]);
                if (result >= 1 && result <= 10 && result2 >= 1 && result2 <= 10)
                    System.out.println(result * result2);
                else
                    System.out.println("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.");
            } else if (str.contains("/")) {
                data = str.split("/");
                result = Integer.parseInt(data[0]);
                result2 = Integer.parseInt(data[1]);
                if (result >= 1 && result <= 10 && result2 >= 1 && result2 <= 10)
                    System.out.println(result / result2);
                else
                    System.out.println("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.");
            }
        } catch (NumberFormatException e) {
            if (str.contains("+")) {
                data = str.split("\\+");
                result = romanСonversion(data[0]);
                result2 = romanСonversion(data[1]);
                if (result >= 1 && result <= 10 && result2 >= 1 && result2 <= 10)
                    System.out.println(romanNumbers[result + result2]);
                else
                    System.out.println("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.");
            } else if (str.contains("-")) {
                data = str.split("-");
                result = romanСonversion(data[0]);
                result2 = romanСonversion(data[1]);
                if (result < result2 || result == result2) {
                    throw new Exception("т.к. в римской системе нет отрицательных чисел");
                }
                if (result >= 1 && result <= 10 && result2 >= 1 && result2 <= 10)
                    System.out.println(romanNumbers[result - result2]);
                else
                    System.out.println("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.");
            } else if (str.contains("*")) {
                data = str.split("\\*");
                result = romanСonversion(data[0]);
                result2 = romanСonversion(data[1]);
                if (result >= 1 && result <= 10 && result2 >= 1 && result2 <= 10)
                    System.out.println(romanNumbers[result * result2]);
                else
                    System.out.println("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.");
            } else if (str.contains("/")) {
                data = str.split("/");
                result = romanСonversion(data[0]);
                result2 = romanСonversion(data[1]);
                if (result >= 1 && result <= 10 && result2 >= 1 && result2 <= 10)
                    System.out.println(romanNumbers[result / result2]);
                else
                    System.out.println("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.");
            }
        }
    }

    public static int romanСonversion(String roman) {
        int result = 0;
        for (int i = 0; i < romanNumbers.length; i++) {
            if (roman.equals(romanNumbers[i]))
                result = i;
        }
        return result;
    }
}
