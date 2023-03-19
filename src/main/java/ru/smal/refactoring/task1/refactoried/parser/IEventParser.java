package ru.smal.refactoring.task1.refactoried.parser;

import ru.smal.refactoring.task1.refactoried.model.EventType;

public interface IEventParser {

    EventType getEventType();

    String parse(byte[] data);
}
