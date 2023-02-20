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
            amountOfSavings = amountOfSavings + amountOfSavings/100;
            amountOfSavings = amountOfSavings + regularPayment;
            System.out.println(amountOfSavings);
        }

        //Задание 1.2
        int i = 10;
        while (i >= 1){
            System.out.print( i ) ;
            i--;
            System.out.println( i );
        }

        int k = 1;
        while (k <= 10){
            System.out.print( k );
            k++;
            System.out.println( k );
        }

        //Задание 1.3

        int population = 12000000;
        int born = 17;
        int death = 8;
        int dif = born - death;
        for(int j = 1; j <= 10; j++){
            population += population * dif / 1000;
        }
        System.out.println("Численность населения составляет" + population);

        //Задание 1.4

        int sum = 12000000;
        int initialAmount = 15000;
        int p = 1;
        while (i > 0){
            sum += initialAmount * 0.07;
    }





    }





