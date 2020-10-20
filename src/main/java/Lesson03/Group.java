package Lesson03;

public class Group {

    private String name;
    private Employee[] group;
    private int index = -1;

    public Group(String name) {
        this.name = name;
        this.group = new Employee[10];
        System.out.println("Создана группа " + name);
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee newEmp) {
        if (index + 1 >= group.length) {
            System.out.println("Группа заполнена, невозможно добавить еще одного сотрудника");
            return;
        }
        group[++index] = newEmp;
        System.out.println("Сотрудник " + newEmp.getName() + " добавлен в группу " + name);
    }

    public void removeEmployee(int i) {
        if (index < 0) {
            System.out.println("В группе " + name + " нет сотрудников");
            return;
        }
        if (i > index) {
            System.out.println("В группе " + name + " нет сотрудника с таким индексом");
            return;
        }
        System.out.println("Сотрудник " + group[i].getName() + " удалён из группы " + name);
        System.arraycopy(group,i+1, group, i,index - i);
        group[index] = null;
        index--;
    }

    public void removeAll() {
        if (index < 0) {
            System.out.println("В группе " + name + " нет сотрудников");
            return;
        }
        for (int i = index; i >= 0; i--) {
            group[i] = null;
        }
        index = -1;
        System.out.println("Все сотрудники удалены из группы " + name);
    }

    public void printGroup() {
        if (index < 0) {
            System.out.println("В группе " + name + " нет сотрудников");
            return;
        }
        System.out.println("Сотрудники группы " + name + ":");
        for (int i = 0; i <= index; i++) {
            System.out.println("Сотрудник " + i);
            group[i].printInfo();
        }
    }
}
