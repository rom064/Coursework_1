package Coursework;

/*1. Создать класс Employee, который содержит информацию о Ф.И.О.,
 отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5. */
public class Employee {
    private final String employee;
    private int department;
    private double salary;

    //4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
    public String getEmployee() {
        return employee;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
    public void setDepartment(int department) {
        this.department = department;
    }

    //3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
    private static int counter = 1;     //2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
    private final int id;

    public int getId() {
        return id;
    }

    //6. По умолчанию все поля должны передавать через конструктор (кроме id)
    // и заполняться в нем (включая id, который нужно получить из счетчика).
    public Employee(String employee, int department, double salary) {
        this.employee = employee;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }

    @Override
    public String toString() {
        return "Ф.И.О. сотрудника: " + getEmployee() + "\nОтдел: " + getDepartment() + "\nЗарплата: " + getSalary() + "\nID: " + id;
    } // 8.a Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
}




