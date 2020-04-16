package ru.oleg;

public class Main {

    public static void main(String[] args) {
        Employee mike = new Employee("Mike", 20000);
        Employee john = new Employee("John", 150000);
        Employee dick = new Employee("Dick", 23000);
        Employee[] staff = new Employee[3];
        staff[0] = mike;
        staff[1] = john;
        staff[2] = dick;

        for (int i = 0; i < staff.length; i++) {
            Employee rabotnik = staff[i];
            System.out.println(rabotnik.toString());
        }

        for (Employee rabotnik : staff) {
            System.out.println(rabotnik.toString());
        }
    }

}
