package ru.smal.refactoring.task1.refactoried.parser;

import ru.smal.refactoring.task1.refactoried.model.EventType;

public class OneMoreEventParser implements IEventParser {
    @Override
    public EventType getEventType() {
        return EventType.ONE_MORE_EVENT;
    }

    @Override
    public String parse(byte[] data) {
        throw new UnsupportedOperationException();
    }
}
