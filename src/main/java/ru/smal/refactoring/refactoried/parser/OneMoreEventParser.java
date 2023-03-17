package ru.smal.refactoring.refactoried.parser;

import ru.smal.refactoring.refactoried.model.EventType;

import static ru.smal.refactoring.refactoried.model.EventType.ONE_MORE_EVENT;

public class OneMoreEventParser implements IEventParser {
    @Override
    public EventType getEventType() {
        return ONE_MORE_EVENT;
    }

    @Override
    public String parse(byte[] data) {
        throw new UnsupportedOperationException();
    }
}
