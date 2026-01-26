public class Main {
    public static void main(String[] args) {
//        задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Ф.И.О сотрудника - " + fullName);
//        задание 2
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
//        задание 3
        String fullName1 = "Иванов Семён Семёнович";
        String Rename = fullName1.replace('ё', 'е');
        System.out.println("Данные Ф.И.О. сотрудника — " + Rename);
    }
}
