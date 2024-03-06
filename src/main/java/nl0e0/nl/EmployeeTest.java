package nl0e0.nl;

public class EmployeeTest {
    public static void main(String[] args){
        Employee emp1 = new Employee("John", "Doe", 34500.00);
        Employee emp2 = new Employee("Jane", "Doe",  37809.00);

        System.out.println("Employee 1: " + emp1.getFirstName() + " " + emp1.getLastName() + "; Yearly Salary: " + emp1.getYearlySalary());
        System.out.println("Employee 2: " + emp2.getFirstName() + " " + emp2.getLastName() + "; Yearly Salary: " + emp2.getYearlySalary());

        emp1.giveRaise(10);
        emp2.giveRaise(10);

        System.out.println("Increasing employee salaries by 10%");

        System.out.println("Employee 1: " + emp1.getFirstName() + " " + emp1.getLastName() + "; Yearly Salary: " + emp1.getYearlySalary());
        System.out.println("Employee 2: " + emp2.getFirstName() + " " + emp2.getLastName() + "; Yearly Salary: " + emp2.getYearlySalary());
    }
}
