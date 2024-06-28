public class Main {
    public static void main(String[] args) {

        int start_capital = 100;
        int deposite = 2000;
        int budget = 0;
        int bonus = deposite / 100;

        if (deposite >= 1000) {
            budget += start_capital + (deposite / 100) + deposite;
        }

        System.out.println( " Стартовый капитал - " + start_capital);
        System.out.println( " Депозит - " + deposite);
        System.out.println( " Итоговый бюджет - " + budget);
        System.out.println( " Итого бонусов -  " + bonus);
    }
}