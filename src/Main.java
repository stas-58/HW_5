public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOs;
        clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("_____");
        System.out.println(" ");


        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println("_____");
        System.out.println(" ");


        System.out.println("Задача 3");
        short year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
        System.out.println("_____");
        System.out.println(" ");


        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryTime + 1));
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryTime + 2));
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println("_____");
        System.out.println(" ");


        System.out.println("Задача 5. Вариант 1");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1, 2, 12: {
                System.out.println("Зима");
            }
            break;
            case 3, 4, 5: {
                System.out.println("Весна");
            }
            break;
            case 6, 7, 8: {
                System.out.println("Лето");
            }
            break;
            case 9, 10, 11: {
                System.out.println("Осень");
            }
            break;
            default: {
                System.out.println("Такого месяца нет");
            }
        }
        System.out.println("_____");
        System.out.println(" ");


        System.out.println("Задача 5. Вариант 2");
        int monthNumber1 = 12;
        switch (monthNumber1) {
            case 1:
            case 2:
            case 12: {
                System.out.println("Зима");
            }
            break;
            case 3:
            case 4:
            case 5: {
                System.out.println("Весна");
            }
            break;
            case 6:
            case 7:
            case 8: {
                System.out.println("Лето");
            }
            break;
            case 9:
            case 10:
            case 11: {
                System.out.println("Осень");
            }
            break;
            default: {
                System.out.println("Такого месяца нет");
            }
        }

    }
}