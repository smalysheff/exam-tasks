package ru.smal.gof_patterns.behavioral.observer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.smal.gof_patterns.behavioral.observer.impl_one.ConcreteObserverA;
import ru.smal.gof_patterns.behavioral.observer.impl_one.ConcreteObserverB;
import ru.smal.gof_patterns.behavioral.observer.impl_one.ConcreteSubject;

@ExtendWith(MockitoExtension.class)
class ConcreteSubjectTest {

    @Spy
    private ConcreteObserverA observerA;

    @Spy
    private ConcreteObserverB observerB;

    @InjectMocks
    private ConcreteSubject subject;

    @Test
    public void observersHandleEventsFromSubject() {
        // Given

        // When
        subject.notifyObservers("No listeners");

        subject.registerObserver(observerA);
        subject.notifyObservers("Message for A");

        subject.registerObserver(observerB);
        subject.notifyObservers("Message for A and B");

        subject.unregisterObserver(observerA);
        subject.notifyObservers("Message for B");

        subject.unregisterObserver(observerB);
        subject.notifyObservers("No listeners");

        // Then
        Mockito.verify(observerA).observe("Message for A");
        Mockito.verify(observerA).observe("Message for A and B");
        Mockito.verifyNoMoreInteractions(observerA);

        Mockito.verify(observerB).observe("Message for A and B");
        Mockito.verify(observerB).observe("Message for B");
        Mockito.verifyNoMoreInteractions(observerB);
    }
}