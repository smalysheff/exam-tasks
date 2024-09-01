package ru.smal.project_reactor;

import lombok.extern.slf4j.Slf4j;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.util.List;

@Slf4j
public class Test {

    private static final Scheduler SCHEDULER = Schedulers.newSingle("test");
    private static final Scheduler SCHEDULER1 = Schedulers.newSingle("test1");

    public static void main(String[] args) {

//        Было List<Tax> taxes = List.of(new Tax(1), new Tax(2));
//
//        Должно стать List<NewTax> newTaxes = List.of(new NewTax(1, CorrectionType.REDUCED), new NewTax(2, CorrectionType.ACCRUED));


    }


}

class Tax {
    int amount;
    public Tax(int amount) {
        this.amount = amount;
    }
}
class NewTax {
    int amount;
    CorrectionType correctionType;
    public NewTax(int amount, CorrectionType correctionType) {
        this.amount = amount;
        this.correctionType = correctionType;
    }
}
enum CorrectionType {
    REDUCED,
    ACCRUED
}


