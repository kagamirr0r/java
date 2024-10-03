public class Cash implements Payment {
    public void pay(int amount) {
        System.out.println((amount + (amount * tax)) + "円を現金で支払う");
    }
}
