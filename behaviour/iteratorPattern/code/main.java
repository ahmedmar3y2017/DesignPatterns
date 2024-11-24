package behaviour.iteratorPattern.code;

import behaviour.iteratorPattern.code.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<Employee>();
        Employee employee = new Employee("ahmed", "tanta", 50);
        Employee employee1 = new Employee("ahmed1", "tanta1", 55);
        Employee employee2 = new Employee("ahmed2", "tanta2", 60);
        Employee employee3 = new Employee("ahmed3", "tanta3", 70);

        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        EmployeeAgregator employeeAgregator = new EmployeeAgregator(employees);
        Iterator iteratior = employeeAgregator.createIteratior();
        while (iteratior.hasNext()) {
            Object next = iteratior.next();
            Employee emp = (Employee) next;

            System.out.println(emp.getName());
            System.out.println(emp.getAddress());
            System.out.println(emp.getAge());

        }

    }
}
