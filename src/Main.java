public class Main {
    public static void main(String[] args) {

        int costTiket = 18666;
        int bonus;

        if (costTiket > 20) {
            bonus = costTiket / 20;
        }
        else {
            bonus=0;
        }
        System.out.println("Стоимость билета = " + costTiket);
        System.out.println("Вам начислится " + bonus + " бонуса(ов)");

    }
}