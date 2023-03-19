package ru.smal.refactoring.task1.refactoried.parser;

import ru.smal.refactoring.task1.refactoried.model.EventType;

import static ru.smal.refactoring.task1.refactoried.model.EventType.SOME_EVENT;

public class SomeEventParser implements IEventParser {
    @Override
    public EventType getEventType() {
        return SOME_EVENT;
    }

    @Override
    public String parse(byte[] data) {
        throw new UnsupportedOperationException();
    }
}
