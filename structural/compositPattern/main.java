package structural.compositPattern;

public class main {

    public static void main(String[] args) {

        Department financeDepartment= new FinanceDepartment();
        Department hrDepartment= new HrDepartment();

        HeadDepartment headDepartment= new HeadDepartment();
        headDepartment.addDepartment(financeDepartment);
        headDepartment.addDepartment(hrDepartment);

        headDepartment.printName();

    }
}
