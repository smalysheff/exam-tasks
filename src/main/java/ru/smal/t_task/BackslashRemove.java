package ru.smal.t_task;

import java.util.ArrayDeque;
import java.util.Objects;

public class BackslashRemove {

    private static final Character BACKSLASH = '#';

    public String cleanString(String str) {
        if (Objects.isNull(str)) {
            return null;
        }
        var stack = new ArrayDeque<Character>();
        char[] charArray = str.toCharArray();
        for (char ch : charArray) {
            if (ch != BACKSLASH) {
                stack.push(ch);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        var result = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            result.append(stack.removeLast());
        }

        return result.toString();
    }
}
