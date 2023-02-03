package ru.smal.common.annotation;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

class AnnotationTest {

    @Test
    void classAnnotationTest() {
        var clazz = SomeAnnotationClass.class;
        var annotation = clazz.getAnnotation(ClassAnnotation.class);

        assertThat(annotation).isNotNull();
        assertThat(annotation.value()).isEqualTo(WeekDayType.MONDAY);
    }

    @Test
    void notAnnotateMethod() throws NoSuchMethodException {
        var clazz = SomeAnnotationClass.class;
        Method method = clazz.getMethod("notAnnotateMethod");
        Annotation[] annotations = method.getAnnotations();

        assertThat(annotations.length).isEqualTo(0);
    }

    @Test
    void annotateMethod() throws NoSuchMethodException {
        var clazz = SomeAnnotationClass.class;
        var method = clazz.getMethod("annotateMethod");
        var annotation = method.getAnnotation(MethodAnnotation.class);

        assertThat(annotation).isNotNull();
        assertThat(annotation.value()).isEqualTo("default");
    }

    @Test
    void annotateMethodWithParameter() throws NoSuchMethodException {
        var clazz = SomeAnnotationClass.class;
        var method = clazz.getMethod("annotateMethodWithParameter");
        var annotation = method.getAnnotation(MethodAnnotation.class);

        assertThat(annotation).isNotNull();
        assertThat(annotation.value()).isEqualTo("parameter");
    }
}