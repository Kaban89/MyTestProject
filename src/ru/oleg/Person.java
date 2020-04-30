package ru.oleg;

public class Person {

    String name;
    double age;
    String city;

    public String writeMeLetter(String userName) {
        return "Привет " + userName + ". Я " + name + ". Мне " + age + " лет и я живу в " + city;
    }

    public Person(String myName, double myAge, String myCity) {
        name = myName;
        age = myAge;
        city = myCity;
    }


    //  public String result() {
    //   return "Привет " + userName() + ". Я " + name + ". Мне " + age + " лет и я живу в " + city;


}
//  Person gosha = new Person(name, age,city);
//  String result = gosha.writeMeLetter("Michael");
//  String result2 = gosha.writeMeLetter("Oleg");
//  String result3 = gosha.writeMeLetter("Sergei");
//System.out.println(result);
//System.out.println(result2);
//System.out.println(result3);