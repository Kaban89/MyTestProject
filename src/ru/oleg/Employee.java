package ru.oleg;

public class Employee {
    String name;
    double year;
    int salary;

    public Employee(String herName, double herYear, int herSalary) {
        name = herName;
        year = herYear;
        salary = herSalary;
    }

    String getName() {
        if (salary > 100000) {
            return "Mr." + name;
        }
        else {
        }
        return "tazovoz" + name;
    }

    double getYear() {
        return year;
    }

    int getSalary() {
        return salary;
    }
}

