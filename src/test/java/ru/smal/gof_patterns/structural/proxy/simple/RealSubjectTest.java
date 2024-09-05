package ru.smal.gof_patterns.structural.proxy.simple;

import lombok.Getter;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RealSubjectTest {

    @Test
    void testRequest() {
        var testPrintStream = new MockPrintStream();
        System.setOut(testPrintStream);

        var subject = new RealSubject();
        subject.request();

        List<String> output = testPrintStream.getOutput();
        assertEquals("RealSubject: Handling request", output.get(0));
    }
}

@Getter
class MockPrintStream extends PrintStream {

    private final List<String> output = new ArrayList<>();

    public MockPrintStream() {
        super(new ByteArrayOutputStream());
    }

    @Override
    public void println(String x) {
        output.add(x);
        super.println(x);
    }
}