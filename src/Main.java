public class Main {
    public static void main(String[] args) {
        int balanceAmount = 100;
        int payment = 1000;
        int incomeBonus;

        if (payment > 100) {
            incomeBonus = (payment / 100);
        } else {
            incomeBonus = 0;
        }

        int totalBalance = (balanceAmount + payment + incomeBonus);
        System.out.println("Баланс вашего счёта: " + totalBalance + " Начислено бонусов: " + incomeBonus);

    }
}
