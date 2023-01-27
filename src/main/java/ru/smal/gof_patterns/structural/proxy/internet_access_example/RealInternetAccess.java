package ru.smal.gof_patterns.structural.proxy.internet_access_example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealInternetAccess implements OfficeInternetAccess {

    private final String employeeName;

    public RealInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        log.info("Internet access granted for employee: [{}]", employeeName);
    }
}
