package ru.smal.gof_patterns.behavioral.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrganizationTest {

    @Test
    void getIterator() {
        String[] accounts = {"111", "222", "333"};
        Organization organization = new Organization("123", accounts);

        Iterator iterator = organization.getIterator();

        for (String account : accounts) {
            assertTrue(iterator.hasNext());
            assertEquals(account, iterator.next().toString());
        }

        assertFalse(iterator.hasNext());
    }
}