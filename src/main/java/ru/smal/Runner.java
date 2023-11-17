package ru.smal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Runner {

    String string;

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        try (var outputStream = new ObjectOutputStream(new FileOutputStream("file"))) {

            outputStream.writeObject(Person.of("Ivan", 10));

            String name;

        }

        try (var in = new ObjectInputStream(new FileInputStream("file"))) {

            var o = (Person) in.readObject();
            System.out.println(o);

        }
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
class Person implements Serializable {
    private String name;
    private int age;
}