package ru.smal.gof_patterns.structural.proxy.internet_access_example;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class RealInternetAccessProxy implements OfficeInternetAccess {

    private OfficeInternetAccess realInternetAccess;
    private final String employeeName;

    public RealInternetAccessProxy(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        if (Role.ADMIN.equals(getRole(employeeName))) {
            realInternetAccess = new RealInternetAccess(employeeName);
            realInternetAccess.grantInternetAccess();
            log.info("With role: [{}]", Role.ADMIN);
        } else {
            log.info("Access denied for employee: [{}] with role: [{}]", employeeName, Role.USER);
        }
    }

    private Role getRole(String employeeName) {
        if (employeeName == null) {
            return Role.USER;
        }
        //Replace with command pattern
        return switch (employeeName) {
            case "Ivan", "Stepan", "Duran" -> Role.ADMIN;
            default -> Role.USER;
        };
    }

    enum Role {
        ADMIN, USER
    }
}
