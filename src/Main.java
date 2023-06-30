public class Main {
    public static void main(String[] args) {
        int account = 300;
        int replenishment = 1500;


        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }

        int total = account + replenishment + bonus;
        System.out.println(" Итоговый счет " + total);
        System.out.println(" Итоговый бонус " + bonus);

    }


}
