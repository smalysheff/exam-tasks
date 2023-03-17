package ru.smal.refactoring.refactoried.parser;

import ru.smal.refactoring.refactoried.model.EventType;

import static ru.smal.refactoring.refactoried.model.EventType.SOME_OTHER_EVENT;

public class SomeOtherEventParser implements IEventParser {
    @Override
    public EventType getEventType() {
        return SOME_OTHER_EVENT;
    }

    @Override
    public String parse(byte[] data) {
        throw new UnsupportedOperationException();
    }
}
