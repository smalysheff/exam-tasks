package ru.smal.gof_patterns.structural.proxy.internet_access_example;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
@Getter
public class RealInternetAccessProxy implements OfficeInternetAccess {

    private static final Map<String, Role> ROLES = Map.of(
            "Ivan", Role.ADMIN,
            "Stepan", Role.ADMIN,
            "Duran", Role.ADMIN,
            "Dmitry", Role.USER
    );

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
        return ROLES.get(employeeName);
    }
}
