import java.time.LocalDate;

public class Main {
    //    задние 1
    public static void checkLeapYear(int year) {
        if (year > 1584) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }
    }

    //задание 2
    public static void suggestAppVersion(int osType, int ClientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (ClientDeviceYear < currentYear) {
            if (osType == 0) {
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегчённую версию приложения для Android по ссылке");
            }
        } else {
            if (osType == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static int distanceToDelivery(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                deliveryDays = 2;
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                deliveryDays = 3;
            } else if (deliveryDistance <= 20) {
                deliveryDays = 1;
            }
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        return deliveryDays;
    }

    public static void main(String[] args) {
//        задние 1
        checkLeapYear(2010);
//        задание 2
        suggestAppVersion(0, 2028);
//        задание 3
        distanceToDelivery(101);
    }
}


