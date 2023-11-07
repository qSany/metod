public class Main {
    public static void main(String[] args) {
        System.out.println("Потребуется дней:" + calculateDeliveryDays(95));
        // Задание 1
        int currentYear = 2021;
        boolean isLeapYear = isLeap(currentYear);

        if (isLeapYear) {
            System.out.println("Год " + currentYear + " високосный");
        } else {
            System.out.println("Год " + currentYear + " не високосный");
        }

        recommendApplicationVersion();
        calculateDeliveryDays();
    }

    static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    // Задание 2

    public static void recommendApplicationVersion() {
        int clientDeviceYear = 2015;
        if ((clientDeviceYear - deviceYear) > 0 && clientOS == 0) {
            System.out.println("Вы можете скачать облегченную версию приложения");
        } else if ((clientDeviceYear - deviceYear) > 0 && clientOS == 1) {
            System.out.println("Вы можете скачать облегченную версию приложения");
        } else {
            System.out.println("Вы можете скачать полную версию приложения");
        }
    }

    // Задание 3


    public static int calculateDeliveryDays(int distance) {
        if (distance > 100) {
            return -1;
        } else {
            int days = 1;
            if (distance > 20) {
                days++;
            }
            if (distance > 60) {
                days++;
            }
            return days;
        }
    }
}