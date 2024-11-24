package behaviour.iteratorPattern.code;

import behaviour.iteratorPattern.code.iterator.EmployeeIterator;
import behaviour.iteratorPattern.code.iterator.Iterator;

import java.util.List;

public class EmployeeAgregator implements Aggregate {

    List<Employee> employees;

    public EmployeeAgregator(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public Iterator createIteratior() {
        return new EmployeeIterator(employees);
    }
}
