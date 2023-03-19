package ru.smal.refactoring.refactoried.model;

public record Event(EventType type, byte[] data) {
}