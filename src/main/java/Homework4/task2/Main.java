package Homework4.task2;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("22-33-44", "Sara Lipina");
        phonebook.add("21-4-54", "Katya Lipina");
        phonebook.add("23-45-1", "Boris");
        phonebook.add("23-45-45", "Alex");
        phonebook.add("22-22-44", "Sara Lipina");
        phonebook.add("21-4-54", "Olga");

        System.out.println("Sara Lipina");
        System.out.println(phonebook.getPhoneByName("Sara Lipina"));
        System.out.println("Petrov");
        System.out.println(phonebook.getPhoneByName("Petrov"));
    }
}
