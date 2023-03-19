package ru.smal.refactoring.task1.initial;

public class Event {
    private final String type;
    private final byte[] data;

    public Event(String type, byte[] data) {
        this.type = type;
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public byte[] getData() {
        return data;
    }
}
