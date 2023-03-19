package ru.smal.refactoring.task1.refactoried.parser;

import ru.smal.refactoring.task1.refactoried.model.EventType;

public class SomeOtherEventParser implements IEventParser {
    @Override
    public EventType getEventType() {
        return EventType.SOME_OTHER_EVENT;
    }

    @Override
    public String parse(byte[] data) {
        throw new UnsupportedOperationException();
    }
}
