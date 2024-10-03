public class Costomer {
    public static void main(String[] args) {
        Payment cash = new Cash(); //Payment型の変数にCashクラスのインスタンスを代入
        Payment suica = new Suica(); //Payment型の変数にSuicaクラスのインスタンスを代入

        Payment[] payments = {cash, suica};

        for (Payment payment : payments) {
            payment.pay(5000); // 5000円支払う
        }

        // suica.charge(4000);
    }
}
