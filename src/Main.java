public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static void task1() {
        //Задача 1.
        System.out.println("Задача 1.");
        int wanted = 2_459_000;
        int total = 0;
        int monthlyFee = 15_000;
        int month = 1;
        while (total < wanted) {
            total = total + monthlyFee;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
            month++;
        }
    }

    private static void task2() {
        //Задача 2.
        System.out.println("Задача 2.");
        int a = 1;
        int all = 10;
        while (a <= all) {
            System.out.println(a + " ");
            a++;
        }
        System.out.println();
        for (a = 10; a >= 1; a--) {
            System.out.println(a + " ");
        }
        System.out.println();
    }

    private static void task3() {
        //Задача 3.
        System.out.println("Задача 3.");
        int population = 12_000_000;
        int k = 1_000;
        int fertility = 17;
        int mortallaty = 8;
        int difference = fertility - mortallaty;
        int years = 10;
        for (int year = 1; year <= years; year++) {
            population = population + population * difference / k;
            System.out.println("Год " + year + " , численность населения составляет " + population);
        }
    }

    private static void task4() {
        //Задача 4.
        System.out.println("Задача 4.");
        int wanted = 12_000_000;
        int total = 15_000;
        int month = 1;
        double percent = 7 / 100D;
        while (total < wanted) {
            total = total + (int) +(total * percent);
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей.");
            month++;
        }
    }

    private static void task5() {
        //Задача 5.
        System.out.println("Задача 5.");
        int wanted = 12_000_000;
        int total = 15_000;
        int month = 1;
        double percent = 7 / 100D;
        while (total < wanted) {
            total = total + (int) +(total * percent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей.");
            }
            month++;
        }
    }

    private static void task6() {
        //Задача 6.
        System.out.println("Задача 6.");
        int months = 9 * 12;
        int total = 15_000;
        double percent = 7 / 100D;
        for (int month = 1; month <= months; month++) {
            total = total + (int) (total * percent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " , сумма накоплений равна " + total + " рублей.");
            }
        }
    }

    private static void task7() {
        //Задача 7.
        System.out.println("Задача 7.");
        int firstFriday = 6;
        for (int friday = firstFriday; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница " + friday + "-е число месяца. Необходимо подготовить отчёт.");
        }
    }

    private static void task8() {
        //Задача 8.
        System.out.println("Задача 8.");
        int currentYear = 2023;
        int start = currentYear - 200;
        int end = currentYear + 100;
        int period = 79;
        int firsTimeAppeard = 0;
        for (int year = start; year <= end; year++) {
            if (year % period == firsTimeAppeard) {
                System.out.println(year);
            }
        }
    }
}


