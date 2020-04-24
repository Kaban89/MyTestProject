package ru.oleg;

class Person {

    public static void main(String[] args) {

        String name = "Oleg";
        double age = 30;
        String city = "Samara";
        writeMeLetter(name, age, city);
    }

    static void writeMeLetter(String name, double age, String city) {
        System.out.println("Привет " + userName() + ". Я " + name + ". Мне " + age + " лет и я живу в " + city);
    }

    private static String userName() {
        return "gosha";
    }
}
