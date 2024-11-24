package behaviour.iteratorPattern.code.iterator;

import behaviour.iteratorPattern.code.Employee;

import java.util.List;

public class EmployeeIterator implements Iterator {

    List<Employee> employeeList;

    int index;

    public EmployeeIterator(List<Employee> employeeList) {

        this.employeeList = employeeList;
    }

    @Override
    public boolean hasNext() {
        if (index < employeeList.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return employeeList.get(index++);
        }
        return false;
    }

    @Override
    public void remove() {

        employeeList.remove(index);
    }
}
