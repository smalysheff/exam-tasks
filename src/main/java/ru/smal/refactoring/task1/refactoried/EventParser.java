package ru.smal.refactoring.refactoried;

import lombok.SneakyThrows;
import org.reflections.Reflections;
import ru.smal.refactoring.refactoried.model.Event;
import ru.smal.refactoring.refactoried.model.EventType;
import ru.smal.refactoring.refactoried.parser.IEventParser;
import ru.smal.refactoring.refactoried.parser.OneMoreEventParser;
import ru.smal.refactoring.refactoried.parser.SomeEventParser;
import ru.smal.refactoring.refactoried.parser.SomeOtherEventParser;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ReflectPermission;
import java.util.*;

import static ru.smal.refactoring.refactoried.model.EventType.*;

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
