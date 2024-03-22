import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arabicNumber = 354;
        String romanNumber = convertToRoman(arabicNumber);
        System.out.println("Arabic to Roman: " + romanNumber);

        String romanValue = "CCCLIV";
        int arabicValue = convertToArabic(romanValue);
        System.out.println("Roman to Arabic: " + arabicValue);
    }
    private static final TreeMap<Integer, String> romanNumerals = new TreeMap<>();

    static {
        romanNumerals.put(1, "I");
        romanNumerals.put(4, "IV");
        romanNumerals.put(5, "V");
        romanNumerals.put(9, "IX");
        romanNumerals.put(10, "X");
        romanNumerals.put(40, "XL");
        romanNumerals.put(50, "L");
        romanNumerals.put(90, "XC");
        romanNumerals.put(100, "C");
        romanNumerals.put(400, "CD");
        romanNumerals.put(500, "D");
        romanNumerals.put(900, "CM");
        romanNumerals.put(1000, "M");
    }

    public static String convertToRoman(int number) {
        if (number <= 0 || number >= 4000) {
            return "Invalid input";
        }
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            int key = romanNumerals.floorKey(number);
            result.append(romanNumerals.get(key));
            number -= key;
        }
        return result.toString();
    }

    public static int convertToArabic(String roman) {
        int result = 0;
        int prevValue = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int value = Integer.parseInt(romanNumerals.get(roman.charAt(i)));
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            prevValue = value;
        }
        return result;
    }
}
