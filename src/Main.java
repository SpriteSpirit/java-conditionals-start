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
        task9();
        task10();
    }

    private static void task1() {
        System.out.println("Задание 1");

        for (int i = 1; i <= 10; i++) {
            if (i == 10) {
                System.out.printf("i = %d%n%n", i);
            } else {
                System.out.printf("i = %d%n", i);
            }
        }
    }

    private static void task2() {
        System.out.println("Задание 2");

        for (int i = 10; i >= 1; i--) {
            if (i == 1) {
                System.out.printf("i = %d%n%n", i);
            } else {
                System.out.printf("i = %d%n", i);
            }
        }
    }

    private static void task3() {
        System.out.println("Задание 3");

        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                if (i != 16) {
                    System.out.printf("i = %d%n", i);
                } else {
                    System.out.printf("i = %d%n%n", i);
                }
            }
        }
    }

    private static void task4() {
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            if (i == -10) {
                System.out.printf("i = %d%n%n", i);
            } else {
                System.out.printf("i = %d%n", i);
            }
        }
    }
    private static void task5() {
        System.out.println("Задание 5");

        for (int i = 1904; i <= 2096; i+=4) {
            if (i == 2096) {
                System.out.printf("%d year is a leap year%n%n", i);
            } else {
                System.out.printf("%d year is a leap year%n", i);
            }
        }
    }
    private static void task6() {
        System.out.println("Задание 6");
        // 7 14 21 28 35 42 49 56 63 70 77 84 91 98
        for (int i = 7; i <= 98; i+=7) {
            if (i == 98) {
                System.out.printf("%d%n%n", i);
            } else {
                System.out.printf("%d ", i);
            }
        }
    }
    private static void task7() {
        System.out.println("Задание 7");
        //1 2 4 8 16 32 64 128 256 512
        for (int i = 1; i <= 512; i*=2) {
            if (i == 512) {
                System.out.printf("%d%n%n", i);
            } else {
                System.out.printf("%d ", i);
            }
        }
    }
    private static void task8() {
        System.out.println("Задание 8");
        int total = 0;
        int monthDeposition = 29_000;

        for (int i = 1; i <= 12; i++) {
            total += monthDeposition;
            if (i == 12) {
                System.out.printf("Month %d, the amount of savings is %d rubles.%n%n", i, total);
            } else {
                System.out.printf("Month %d, the amount of savings is %d rubles.%n", i, total);
            }
        }
    }
    private static void task9() {
        System.out.println("Задание 9");
        int total = 0;
        int monthDeposition = 29_000;
        double percent = 0.12;

        for (int i = 1; i <= 12; i++) {
            total += monthDeposition;
            total += (int) (total*percent/12);
            if (i == 12) {
                System.out.printf("Month %d, the amount of savings is %d rubles.%n%n", i, total);
            } else {
                System.out.printf("Month %d, the amount of savings is %d rubles.%n", i, total);
            }
        }

    }
    private static void task10() {
        System.out.println("Задание 10");
        for (int i = 1; i <= 10; i++) {
            int result = 2 * i;
            if (i == 10) {
                System.out.printf("2 * %d = %d%n%n", i, result);
            } else {
                System.out.printf("2 * %d = %d%n", i, result);
            }
        }
    }
}