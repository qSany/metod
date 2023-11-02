public class Main {
    public static void main(String[] args) {

        // Задание 1
        int currentYear = 2021;
        boolean isLeapYear = false;

        isLeapYear = isLeap(currentYear);

        if (isLeapYear) {
            System.out.println("Год " + currentYear + " високосный");
        } else {
            System.out.println("Год " + currentYear + " не високосный");
        }

        versionSelector();
        DeliveryDays();
    }

    static boolean isLeap(int year) {
        if ((year % 4 == 0) && (year % 100 != 0)) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Задание 2
    public static void versionSelector() {
        System.out.print("Текущий год (например, 2021):");
        int currentYear = 2015;
        System.out.print("Год выпуска вашего устройства (четный - iOS, нечетный - Android):");
        int deviceYear = 2023;
        if (deviceYear % 2 != 0) {
            System.out.println("Похоже, у вас Android-устройство " + deviceYear +
                    ". Если ваше устройство старше текущего года, мы рекомендуем установить облегченную версию.");
        } else {
            System.out.println("Похожо, у вас iOS-устройство " + deviceYear +
                    ". Если ваше устройство старше текущего года, мы реккомендуем установить облегченную версию.");
        }
    }

    // Задание 3
    public static void DeliveryDays() {

        int deliveryDistance = 95;
        int days = 0;

        if (deliveryDistance > 100) {
            days = -1;
        } else if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance < 60) {
            days = 2;
        } else {
            days = 3;
        }

        System.out.println("Потребуется дней: " + days);

    }
}


