package ru.oleg;

class Employee {
    String name;
    double salary;

    public Employee(String myName, double mySalary) {
        name = myName;
        salary = mySalary;
    }

    String getName() {
        if (salary > 100000) {
            return "Mr." + name;
        } else {
            return name;
        }
    }

    double getSalary() {
        if ( name.equals("Mike") ) {
            return salary - 10000;
        } else {
            return salary;
        }
    }

    void setSalary(double myNewSalary) {
        salary = myNewSalary;
    }

    void raiseSalary(double nadbavka) {
        salary = salary + nadbavka;
    }

    public String toString() {
        return getName() + ": " + getSalary();
    }
}

