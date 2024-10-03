public class Suica implements Payment {
    public void pay(int amount) {
        System.out.println((amount + (amount * tax)) + "円をSuicaで支払う");
    }

    public void charge(int amount) {
        System.out.println("Suicaに" + amount+ "円をチャージする");
    }
}
