package ru.smal.any_tasks;

public class CustomString {

    private String text;

    private CustomString() {
    }

    private CustomString(String text) {
        this.text = text;
    }

    public static CustomString of(String text) {
        return new CustomString(text);
    }

    public CustomString replace(char oldChar, char newChar) {
        char[] charArray = this.text.toCharArray();
        for(int i = 0; i < charArray.length; i++) {
            if (charArray[i] == oldChar) {
                charArray[i]= newChar;
            }
        }
        this.text = new String(charArray);
        return this;
    }

    public String getText() {
        return this.text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
