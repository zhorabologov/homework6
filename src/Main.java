public class Main {
    public static void main(String[] args) {
        //Задание 1
        for (int i = 1; i < 10 ; i++) {
            System.out.println(i);}


        //Задание 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);}

        //Задание 3
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);}
        
        //Задание 4
        for (int i = 10; i >= -10 ; i--) {
            System.out.println(i);}

        // Задание 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i);}

        // Задание 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);}

        // Задание 7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);}
        
        // Задание 8
        int salary = 29_000;
        int cash = 0;
        for (int i = 1; i <=12 ; i++) {
        cash += salary;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + cash + "рублей");}

        //Задание 9
        double percent = 0.12;
        double cashWithPercent = 0;
        for (int i = 1; i <=12 ; i++) {
            cashWithPercent = (cashWithPercent + salary) * (1 + percent) / 12;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + cashWithPercent + "рублей");}
        
        // Задание 10
        for(int i = 0; i < 10; i++){
            for(int k = 0; k < 10; k++){
                System.out.printf("%4d", (i + 1) * (k + 1));
                System.out.println();
    }
            
        }







    }
}

