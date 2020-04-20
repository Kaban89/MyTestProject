package ru.oleg;

public class Main {

    public static void main(String[] args) {
        Employee[] nameAuto = new Employee[5];
        Employee vaz = new Employee("Vaz", 1999, 30000);
        Employee mazda = new Employee("Mazda", 2003, 100000);
        Employee bmw = new Employee("Bmw", 2005, 150000);
        Employee gaz = new Employee("Gaz", 2002, 50000);
        Employee rover = new Employee("Rover", 2010, 200000);

        nameAuto[0] = vaz;
        nameAuto[1] = mazda;
        nameAuto[2] = bmw;
        nameAuto[3] = gaz;
        nameAuto[4] = rover;

        for (int i = 0; i < nameAuto.length; i++) {
            Employee buy = nameAuto[i];
            System.out.println(buy.getSalary());
        }
    }

}
