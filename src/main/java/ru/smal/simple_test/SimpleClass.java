package ru.smal.simple_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SimpleClass {

    public static void main(String[] args) {
        SimpleClass simpleClass = new SimpleClass();

        simpleClass.setList(List.of("1", "2", "3"));
    }

    private List<String> list;

    public SimpleClass() {
    }


    public List<String> getList() {
        return this.list;
    }

    public void setList(List<String> list) {
        this.list = Objects.requireNonNullElseGet(list, ArrayList::new);
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SimpleClass)) return false;
        final SimpleClass other = (SimpleClass) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$list = this.getList();
        final Object other$list = other.getList();
        if (this$list == null ? other$list != null : !this$list.equals(other$list)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SimpleClass;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $list = this.getList();
        result = result * PRIME + ($list == null ? 43 : $list.hashCode());
        return result;
    }

    public String toString() {
        return "SimpleClass(list=" + this.getList() + ")";
    }
}
