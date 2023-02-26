public class Main {
    public static void main(String[] args) {
        //Задание 1
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }


        //Задание 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Задание 3
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

        //Задание 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        // Задание 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i);
        }

        // Задание 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        // Задание 7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        // Задание 8
        int salary = 29_000;
        int cash = 0;
        for (int i = 1; i <= 12; i++) {
            cash += salary;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + cash + "рублей");
        }

        //Задание 9
        double percent = 0.12;
        double cashWithPercent = 0;
        for (int i = 1; i <= 12; i++) {
            cashWithPercent = (cashWithPercent + salary) * (1 + percent) / 12;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + cashWithPercent + "рублей");
        }

        //Задание 1.1
        int regularPayment = 15000;
        int amountOfSavings = 0;
        while (amountOfSavings <= 2459000) {
            amountOfSavings = amountOfSavings + amountOfSavings / 100;
            amountOfSavings = amountOfSavings + regularPayment;
            System.out.println(amountOfSavings);
        }

        //Задание 1.2
        int j = 10;
        while (j >= 1) {
            System.out.print(j);
            j--;
            System.out.println(j);
        }

        int k = 1;
        while (k <= 10) {
            System.out.print(k);
            k++;
            System.out.println(k);
        }

        //Задание 1.3

        int population = 12000000;
        int yearCount = 10;
        int born = 17;
        int death = 8;
        for (int i = 1; i <= yearCount; ++i) {
            population += population * yearCount / 1000;
        }
        System.out.println("Год" + yearCount + "Численность населения составляет" + population);

        //Задание 1.4 5

        double currentMoney = 15000;
        double rate = 0.07;
        int totalMoney = 12000000;
        int currentMonth = 1;
        while (currentMoney <= totalMoney) {
            currentMoney *= (1 + rate);

            if (currentMonth % 6 == 0) {
                System.out.println("месяц" + currentMonth + " накопления " + currentMoney);
            }
            ++currentMonth;
        }
        System.out.println("месяц" + currentMonth + " накопления " + currentMoney);

        //Задание 1.6

        double money = 15000;
        double rateMonth = 0.07;

        for (int month = 1; month < 9 * 12; ++month) {
            money *= (1 + rateMonth);
            if (month % 6 == 0) {
                System.out.println("месяц" + month + " накопления " + money);
            }
        }

        //Задание 1.7

        int friday = 5;
        while (friday <= 31) {
            System.out.println("");
            friday += 7;
        }

        for ( ; friday <= 31; friday += 7) {
            System.out.println("");
        }

        for (int i = friday; i <= 31; i += 7) {
            System.out.println(" Сегодня пятница, " + i + " число." + "Необходимо подготовить отчет");
        }

        //Задание 8

        int carrentYear = 2023;
        int fromYear = 200;
        int toYear = carrentYear +100;

        for (int i = fromYear; i <= toYear ; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 79; i <= toYear; i += 79) {
            if (i >= fromYear) {
                System.out.println(i);
            }
        }



        }

    }











