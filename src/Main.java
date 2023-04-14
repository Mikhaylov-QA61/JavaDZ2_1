public class Main {
    public static void main(String[] args) {

        int costTiket = 18666;
        int bonus = 20;
        int bonusCustomer;

        if (costTiket > 20) {
            bonusCustomer = costTiket / bonus;
        } else{
            bonusCustomer = 0;
        }
        System.out.println("Стоимость билета = " + costTiket);
        System.out.println("Вам начислится " + bonusCustomer + " бонуса(ов)");

    }
}