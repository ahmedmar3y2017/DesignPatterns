package structural.compositPattern;

import behaviour.iteratorPattern.code.Employee;

import java.util.LinkedList;
import java.util.List;

public class HeadDepartment implements Department {

    List<Department> departments
            = new LinkedList<Department>();


    public void addDepartment(Department department) {

        departments.add(department);
    }

    @Override
    public void printName() {

        departments.forEach(Department::printName);
    }
}
