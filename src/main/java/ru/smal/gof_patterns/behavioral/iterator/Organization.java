package ru.smal.gof_patterns.behavioral.iterator;

public class Organization implements Collection {

    private String inn;
    private String[] accounts;

    public Organization(String inn, String[] accounts) {
        this.inn = inn;
        this.accounts = accounts;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String[] getAccounts() {
        return accounts;
    }

    public void setAccounts(String[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public Iterator getIterator() {
        return new OrganizationIterator();
    }

    private class OrganizationIterator implements Iterator {

        private int index;

        @Override
        public boolean hasNext() {
            return index < accounts.length;
        }

        @Override
        public Object next() {
            return accounts[index++];
        }
    }
}
