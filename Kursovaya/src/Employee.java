import java.util.Objects;

public class Employee {
    private final String fullName;
    private int department;
    private double salary;
    private final int id; //поле id

    public static int idEmployee = 0; //статический счётчик id


    public Employee(String fullName, int department, double salary) { //конструктор
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = ++idEmployee; //счётчик
    }


    public String getFullName() { //пошли геттеры
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) { //сеттер департамента
        this.department = department;
    }

    public void setSalary(double salary) { //сеттер салари
        this.salary = salary;
    }

    @Override //контракт ну  типо сравние
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee salaries = (Employee) obj;
        return salary == salaries.salary && id == salaries.id &&
                Objects.equals(fullName, salaries.fullName) &&
                Objects.equals(department, salaries.department);
    }
    @Override
    public String toString() { //ретурн инфы в консоль
        return id + ". " + "Ф.И.О. - " + this.fullName + ", " + "Отдел - " + this.department + ", " + "Зарплата - " + this.salary;
    }
    public void printShortInfo() {
        System.out.println(fullName + ", " + salary);
    }
}
