package Lesson08;

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {

    private HashMap<String, ArrayList<String>> phonebook;

    public Phonebook() {
        phonebook = new HashMap();
    }

    public void add(String surname, String phone) {

        if (!phonebook.containsKey(surname)) {
            ArrayList<String> phones = new ArrayList<>();
            phones.add(phone);
            phonebook.put(surname, phones);
            System.out.println("Запись добавлена");
            return;
        }
        ArrayList<String> phones = phonebook.get(surname);
        if (!phones.contains(phone)) {
            phones.add(phone);
            phonebook.put(surname, phones);
            System.out.println("Запись добавлена");
            return;
        }
        System.out.println("Такой номер телефона уже записан для человека с такой фамилией");
    }

    public void printPhones(String surname) {
        if (!phonebook.containsKey(surname)) {
            System.out.println("Нет записей с такой фамилией");
            return;
        }
        System.out.println(phonebook.get(surname));
    }
}
