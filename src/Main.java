public class Main {
    public static void main(String[] args) {
        int account = 500;
        // Начальный счет
        int refill = 2000;
        // Сумма пополнения счета
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int total = account + refill + bonus;
        System.out.println("Итоговая сумма: " + total);
        System.out.println("Бонус: " + bonus);
        ;
    }

}

