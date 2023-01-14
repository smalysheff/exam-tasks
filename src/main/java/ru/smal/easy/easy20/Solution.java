package ru.smal.easy.easy20;

import java.util.*;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 */
public class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Set<Character> closingBrackets = Set.of(')', '}', ']', '>');
        Map<Character, Character> closeBracketToOpenBracket = Map.of(
                ')', '(',
                '}', '{',
                ']', '[',
                '>', '<'
        );

        for(var ch : s.toCharArray() ) {
            if (closingBrackets.contains(ch)) {
                if (stack.empty() || stack.peek() != closeBracketToOpenBracket.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        return stack.empty();
    }
}
