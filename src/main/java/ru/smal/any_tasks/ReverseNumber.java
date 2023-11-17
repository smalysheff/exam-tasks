package ru.smal.any_tasks;

/**
 * 123 -> 321
 * 400 -> 4
 */
public class ReverseNumber {

    public int apply(int num) {
        if (num == 0) {
            return 0;
        }

        long result = 0;
        int radix = 10;
        while (num != 0) {
            result = (result + num % radix) * radix;
            num /= radix;
        }

        result /= radix;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) result;
    }

    public int applyUseStringBuilder(int num) {
        var result = new StringBuilder(String.valueOf(num));
        return Integer.parseInt(result.reverse().toString());
    }
}
