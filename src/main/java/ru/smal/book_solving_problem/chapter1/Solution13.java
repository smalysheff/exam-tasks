package ru.smal.book_solving_problem.chapter1;

/**
 * Удаление заданного символа
 */
public class Solution13 {

    public String removeSymbol1(String beginner, char removed) {
        return beginner.replace(String.valueOf(removed), "");
    }

    public String removeSymbol2(String beginner, char removed) {
        int length = beginner.length();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char ch = beginner.charAt(i);
            if (ch != removed) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public String removeSymbol3(String beginner, char removed) {
        char[] chars = beginner.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char ch : chars) {
            if (ch != removed) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public String removeSymbol4(String beginner, char removed) {
        return beginner
                .chars()
                .filter(ch -> ch != removed)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
