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

    public static void task1 () {
        System.out.println("Задача 1");
        int vklad = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            i +=1;
            total += total/100;
            total += vklad;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int a = 0;
        while (a < 10) {
            a +=1;
            System.out.print(a + " ");
        }
        System.out.println();
        for (int b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }
        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int total = 12_000_000;
        float fertility = total * 0.017f;
        float mortality = total * 0.008f;
        int year = 0;
        while (year < 10) {
            year++;
            total += fertility;
            total -= mortality;
            System.out.println("Год " + year + ", численность населения составляет " + total);
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int vklad = 15000;
        int total = 0;
        int i = 0;
        while (total <= 12_000_000) {
            i +=1;
            total += total*0.07;
            total += vklad;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println(i);
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int vklad = 15000;
        int total = 0;
        int i = 0;
        while (total <= 12_000_000) {
            i +=1;
            total += total*0.07;
            total += vklad;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
        System.out.println(i);
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int vklad = 15000;
        int total = 0;
        int i = 1;
        while (i <= 12*9) {
            i += 1;
            total += total * 0.07;
            total += vklad;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int first = 5;
        int i = 1;
        while (i <= 31) {
            System.out.println("Сегодня пятница, " + first + " число. Необходимо подготовить отчёт.");
            i += 7;
            first += 7;
        }
    }
    // до меня никак не дойдёт, как убрать последний прогон, чтоб 33 число не выводилось((

    public static void task8 () {
        System.out.println("Задача 8");
        int startYear = 2022 - 200;
        int finishYear = 2022 + 100;
        for (int i = 0; i <= finishYear; i += 79) {
            if (i >= startYear)
                System.out.println(i);
        }
    }
}