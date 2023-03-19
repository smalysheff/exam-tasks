package ru.smal.refactoring.task1.refactoried;

import lombok.SneakyThrows;
import org.reflections.Reflections;
import ru.smal.refactoring.task1.refactoried.model.Event;
import ru.smal.refactoring.task1.refactoried.model.EventType;
import ru.smal.refactoring.task1.refactoried.parser.IEventParser;

import java.util.*;

public class EventParser {

    private static final Map<EventType, IEventParser> map = new HashMap<>();

    static {
        Reflections reflections = new Reflections(IEventParser.class.getPackageName());
        reflections.getSubTypesOf(IEventParser.class)
                .forEach(EventParser::eventTypeAndEventParserToMap);

        for (EventType type : EventType.values()) {
           if (!map.containsKey(type)) {
               throw new IllegalStateException(String.format("There is no IEventParser implementation for EventType '%s'", type));
           }
        }
    }

    @SneakyThrows
    private static void eventTypeAndEventParserToMap(Class<? extends IEventParser> aClass) {
        var instance = aClass.getDeclaredConstructor().newInstance();
        map.put(instance.getEventType(), instance);
    }

    public List<String> parse(List<Event> events) {
        return events.stream()
                .map(this::parse)
                .toList();
    }

    public String parse(Event event) {
        return map.get(event.type())
                .parse(event.data());
    }
}
