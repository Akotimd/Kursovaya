import java.util.Arrays;

public class EmployeeBook {
    static final Employee[] employees = new Employee[10];

    public static void fillingArrBook(Employee newEmployees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployees;
                break;
            }
        }
    }

    public static void getEmployee() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static void printAllEmployees() {
        System.out.println(Arrays.toString(employees));
    }

    public static double calculateSumOfSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }

    public static double averageSalary() {
        double sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
                count++;
            }
        }
        if (count == 0) return 0;
        return calculateSumOfSalary() / count;
    }

    public static String taxedSalary(String type) {
        for (Employee employee : employees) {
            if (employee == null)
                continue;
            double salary = employee.getSalary();
            double tax = 0;
            switch (type) {
                case "PROPORTIONAL":
                    tax = salary * 0.13;
                    break;
                case "PROGRESSIVE":
                    if (salary < 150) {
                        tax = salary * 0.13;
                    } else if (salary <= 350) {
                        tax = salary * 0.17;
                    } else {
                        tax = salary * 0.21;
                    }
                    break;
                default:
                    System.out.println("Invalid type");
            }
            System.out.println(employee.getFullName() + " - налог: " + tax);
        }
        return "";
    }
    public void  indexSalary(int department, double percentage) {
        for (Employee employee : employees) {
            if (employee == null) continue;
            if (employee.getDepartment() != department) continue;
            double salary = employee.getSalary() * (1 + percentage / 100);
            employee.setSalary(salary);
        }
    }
    public void findFirstEmployeeWithSalaryGreater(int department, double wage) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee == null) continue;
            if (employee.getDepartment() == department &&  employee.getSalary() > wage) {
                System.out.println("Место " + (i + 1) + ": ");
                employee.printShortInfo();
                break;
            }
        }
    }
    public void findFirstEmployeeWithSalaryLess(double wage, int empNumber) {
        int i = 0;
        int j = 0;
        while (i < employees.length &&  j < empNumber) {
            Employee employee = employees[i];
            if (employee != null && employee.getSalary() < wage) {
                employee.printShortInfo();
                j++;
            }
            i++;
            if (j == empNumber) break;
        }
    }
    public boolean EmpBySalary(Employee employee) {
        for (Employee emp : employees) {
            if (employee != null && emp.equals(employee)) {
                return true;
            }
        }
        return false;
    }
    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}


