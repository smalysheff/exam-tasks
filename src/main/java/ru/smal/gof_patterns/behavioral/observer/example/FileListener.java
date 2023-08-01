package ru.smal.gof_patterns.behavioral.observer.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class FileListener implements Observer<String> {

    private final File file;

    public FileListener(File file) {
        this.file = file;
    }

    @Override
    public void update(String s) {
        writeText("File listener: " + s + "\n");
    }

    private void writeText(String text) {
        try {
            Files.write(file.toPath(), text.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
