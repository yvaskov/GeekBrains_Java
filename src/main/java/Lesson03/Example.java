package Lesson03;

public class Example {
    public static void main(String[] args) {
        Employee e1 = new Employee("Иван","ivan@g.com",18,"Инженер");
        Employee e2 = new Employee("Пётр","petr@g.com",21,"Программист");
        Employee e3 = new Employee("Оксана","oksana@g.com",40,"Уборщик");
        Employee e4 = new Employee("Саша","sasha@g.com",33,"Бухгалтер");

        e1.printInfo();

        Group dept = new Group("Департамент");
        dept.printGroup();

        dept.addEmployee(e1);
        dept.addEmployee(e2);
        dept.addEmployee(e3);
        dept.addEmployee(e4);
        dept.printGroup();

        dept.removeEmployee(11);
        dept.removeEmployee(2);
        dept.removeEmployee(0);
        dept.printGroup();

        dept.removeAll();
        dept.printGroup();
    }
}
