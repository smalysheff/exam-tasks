package ru.smal.common.core.annotation;

@ClassAnnotation(WeekDayType.MONDAY)
public class SomeAnnotationClass {

    public String notAnnotateMethod() {
        return "notAnnotateMethod";
    }

    @MethodAnnotation
    public String annotateMethod() {
        return "annotateMethod";
    }

    @MethodAnnotation("parameter")
    public String annotateMethodWithParameter() {
        return "annotateMethodWithParameter";
    }
}
