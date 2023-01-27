package ru.smal.gof_patterns.structural.proxy.internet_access_example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RealInternetAccessProxyTest {

    @Test
    void grantInternetAccessNotNull() {
        RealInternetAccessProxy ivan = new RealInternetAccessProxy("Ivan");
        ivan.grantInternetAccess();

        RealInternetAccessProxy stepan = new RealInternetAccessProxy("Stepan");
        stepan.grantInternetAccess();

        RealInternetAccessProxy duran = new RealInternetAccessProxy("Duran");
        duran.grantInternetAccess();

        Assertions.assertThat(ivan.getRealInternetAccess()).isNotNull();
        Assertions.assertThat(stepan.getRealInternetAccess()).isNotNull();
        Assertions.assertThat(duran.getRealInternetAccess()).isNotNull();
    }

    @Test
    void grantInternetAccessNull() {
        RealInternetAccessProxy nullName = new RealInternetAccessProxy(null);
        nullName.grantInternetAccess();

        RealInternetAccessProxy fake = new RealInternetAccessProxy("fake");
        fake.grantInternetAccess();

        Assertions.assertThat(nullName.getRealInternetAccess()).isNull();
        Assertions.assertThat(fake.getRealInternetAccess()).isNull();

    }
}