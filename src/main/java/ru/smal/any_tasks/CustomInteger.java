package ru.smal.any_tasks;

public class CustomInteger {

    private Integer value;

    private CustomInteger() {
    }

    private CustomInteger(Integer value) {
        this.value = value;
    }

    public static CustomInteger newInstance() {
        return new CustomInteger(0);
    }

    public static CustomInteger newInstance(Integer value) {
        return new CustomInteger(value);
    }

    public CustomInteger parseInt(String value) {
        for (char ch : value.toCharArray()) {
            if (!Character.isDigit(ch)) {
                throw new IllegalArgumentException("String is not integer");
            }
            this.value = this.value * 10 + (ch - '0');
        }
        return this;
    }

    public CustomInteger parseInt1(String value) {
        boolean isNegative = false;
        int i = 0;
        if (value.charAt(0) == '-') {
            isNegative = true;
            i = 1;
        }

        while (i < value.length()) {
            if (value.charAt(i) < '0' || value.charAt(i) > '9') {
                throw new IllegalArgumentException("String is not integer");
            }
            this.value = this.value * 10 + (value.charAt(i) - '0');
            i++;
        }

        this.value = isNegative ? -this.value : this.value;
        return this;
    }

    public Integer getValue() {
        return this.value;
    }
}
