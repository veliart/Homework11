import java.time.LocalDate;
public class Main {
    public static void isLeapYear(int verifiableYear) {
        if ((verifiableYear % 400 == 0) || (verifiableYear % 4 == 0 && verifiableYear % 100 != 0)) {
            System.out.println(verifiableYear + " год является високосным");
        }
        else {
            System.out.println(verifiableYear + " год не является високосным");
        }
    }
    public static void checkMobileSystem(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else if (clientOS > 1 || clientOS < 0){
                System.out.println("К сожалению, наше приложение не поддерживает Вашу операционную систему");
            }
        }
        else if (clientDeviceYear == currentYear) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientOS > 1 || clientOS < 0){
                System.out.println("К сожалению, наше приложение не поддерживает Вашу операционную систему");
            }
        }
        else {
            System.out.println("Ваша модель устройства еще не вышла в релиз");
        }
    }
    public static void deliveryCard(int deliveryDistance) {
        int deliveryTime;
        if (deliveryDistance <= 20) {
            deliveryTime = 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else {
            System.out.println("Доставки нет!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int inputYear = 2020;
        isLeapYear(inputYear);
        System.out.println("Задание 2");
        int deviceYear = 2021;
        int clientOS = 1;
        checkMobileSystem(clientOS, deviceYear);
        System.out.println("Задание 3");
        int deliveryDistance = 115;
        deliveryCard(deliveryDistance);
    }
}