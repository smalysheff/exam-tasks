package ru.smal.refactoring.refactoried.parser;

import ru.smal.refactoring.refactoried.model.EventType;

public interface IEventParser {

    EventType getEventType();

    String parse(byte[] data);
}
