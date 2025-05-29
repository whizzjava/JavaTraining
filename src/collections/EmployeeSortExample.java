package collections;

import java.util.*;

class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private int empNo;

    public Employee(String name, int age, int empNo) {
        this.name = name;
        this.age = age;
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getEmpNo() {
        return empNo;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", empNo=" + empNo + "}";
    }

    @Override
    public int compareTo(Employee e) {
        return this.getName().compareTo(e.getName());
    }
}

class EmployeeComparatorAge implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getAge(), e2.getAge());
    }
}

class EmployeeComparatorEmpNo implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getEmpNo(), e2.getEmpNo());
    }
}

public class EmployeeSortExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 102));
        employees.add(new Employee("Bob", 25, 101));
        employees.add(new Employee("Alice", 28, 100));
        employees.add(new Employee("Charlie", 35, 105));

       // Collections.sort(employees);

        System.out.println("Before sorting:");
        for (Employee e : employees) {
            System.out.println(e);
        }

       //Collections.sort(employees, new EmployeeComparatorAge());
       Collections.sort(employees, new EmployeeComparatorEmpNo());

        System.out.println("\nAfter sorting:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
