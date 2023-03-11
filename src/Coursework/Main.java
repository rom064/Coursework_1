package Coursework;

public class Main {

    public static void main(String[] args) {

// Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 23443.45);
        employees[1] = new Employee("Петров Петр Петрович", 3, 34664.56);
        employees[2] = new Employee("Сергеев Сергей Сергеевич", 5, 56865);
        employees[3] = new Employee("Романов Роман Романович", 1, 23488);
        employees[4] = new Employee("Максимов Максим Максимович", 4, 75432.56);
        employees[5] = new Employee("Николаев Николай Николаевич", 2, 35427);
        employees[6] = new Employee("Викторов Виктор Викторович", 4, 32754.83);
        employees[7] = new Employee("Артемов Артем Артемович", 2, 57647.5);
        employees[8] = new Employee("Павлов Павел Павлович", 5, 42456);
        employees[9] = new Employee("Александров Александр Александрович", 3, 89353.6);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

        System.out.println();
        isSumSalary(employees);
        System.out.println();
        isMinSalary(employees);
        System.out.println();
        isMaxSalary(employees);
        System.out.println();
        isAverageSalary(employees);
        System.out.println();
        System.out.println("Список всех сотрудников: ");
        printEmployees(employees);

    }
    //    8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:


    public static void isSumSalary(Employee[] arr) {
        // b. Посчитать сумму затрат на зарплаты в месяц.
        double sumSalary = 0;
        for (int i = 0; i < arr.length; i++) {
            sumSalary += arr[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sumSalary);

    }

    public static void isMinSalary(Employee[] arr) {
        //    c. Найти сотрудника с минимальной зарплатой.
        Employee employeeWithMinSalary = arr[0];
        for (Employee employee : arr) {
            if (employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeWithMinSalary);
    }

    public static void isMaxSalary(Employee[] arr) {
        //    d. Найти сотрудника с максимальной зарплатой.
        Employee employeeWithMaxSalary = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = arr[i];
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeWithMaxSalary);
    }

    public static void isAverageSalary(Employee[] arr) {
        //    e. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
        int arrSize = arr.length;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getSalary();
        }
        System.out.println("Cреднее значение зарплат: " + sum / arrSize);
    }

    public static void printEmployees(Employee[] employees) {
        //    f. Получить Ф. И. О. всех сотрудников (вывести в консоль).
        for (Employee employee : employees) {
            System.out.println(employee.getEmployee());
        }
    }


}