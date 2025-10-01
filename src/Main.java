public class Main {
    public static void main(String[] args) {
        /// Task 1
        int firstFriday = 1;

        for (byte i = 1; i <= 31; i++) {
            if (i % 7 == firstFriday) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }

        /// Task 2
        int distance = 0;

        do {
            distance += 500;
            System.out.println("Держитесь! Осталось " + (42195 - distance) + " метров");
        } while (distance < (42_195 - 500));

        for (distance = 0; distance < 42_195; distance += 500) {
            System.out.println("Держитесь! Осталось " + (42195 - distance) + " метров");
        }

        /// Task 3
        byte curDay = 0;
        short curSum = 1000;

        while (curSum >= 100) {
            curDay++;
            if (curDay % 5 == 0) {
                continue;
            }
            curSum -= 100;
        }
        System.out.println(curDay);
        curDay = 0;

        for (curSum = 1000; curSum >= 100; ) {
            curDay++;
            if (curDay % 5 == 0) {
                continue;
            }
            curSum -= 100;
        }
        System.out.println(curDay);

        /// Task 4
        short month = 0;
        int total = 0;

        while (true) {
            total += 15000;
            if (month % 6 == 0) {
                total *= 1.07;
            }
            month++;
            System.out.println("Месяц " + month + " сумма " + total);
            if (total >= 12_000_000) {
                break;
            }
        }

        /// Task 5
        byte charge = 20;
        short minute = 0;
        byte overheats = 0;

        while (charge < 100) {
            if (overheats > 3) {
                System.out.println("Досрочное завершение задания");
                break;
            }
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                System.out.println("Перегрев");
                minute += 2;
                continue;
            }
            charge += 2;
        }
        System.out.println("Время зарядки составило " + minute + " минут");
    }
}