package Lesson03;

public class Employee {

    private String name;
    private String email;
    private int age;
    private String title;

    public Employee(String name, String email, int age, String title) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.title = title;
        System.out.println("Создан сотрудник " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void printInfo() {
        System.out.print("Имя: " + name);
        System.out.print(" / E-mail: " + email);
        System.out.print(" / Возраст: " + age);
        System.out.println(" / Должность: " + title);
    }
}
