public class Main {
    public static void main(String[] args) {
        Employee id1 = new Employee("Васильевич Иван Иванович", 3, 350);
        Employee id2 = new Employee("Редисовна Лариса Петровна", 2, 150);
        Employee id3 = new Employee("Раисовна Светлана Евгеньевна", 4, 50);

        System.out.println(id1);
        // шорт инфо
        id1.printShortInfo();

        System.out.println(id1.getId());
        //заполнение массива
        EmployeeBook.fillingArrBook(id1);
        EmployeeBook.fillingArrBook(id2);
        EmployeeBook.fillingArrBook(id3);

        EmployeeBook book1 = new EmployeeBook();
        //все сотрудники
        book1.getEmployee();
        book1.printAllEmployees();
        //зарплаты
        System.out.println("Сумма зарплат: " + EmployeeBook.calculateSumOfSalary());
        System.out.println(String.format("Средняя зарплат: %.2f ", EmployeeBook.averageSalary()));
        //налоги
        System.out.println(EmployeeBook.taxedSalary("PROGRESSIVE"));
        //индексация
        book1.indexSalary(3, 10);
        book1.printAllEmployees();
        //найти сотрудников с зарплатой выше
        book1.findFirstEmployeeWithSalaryGreater(3, 350);
        book1.findFirstEmployeeWithSalaryGreater(2, 130);
        //найти меньше
        book1.findFirstEmployeeWithSalaryLess(34, 3);
        System.out.println("Сотрудник " + book1.EmpBySalary(id2));
        //получение сотрудника по id
        Employee found = book1.getEmployeeById(3);
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Не найден");
        }
    }
}