public class UtmeTest {
    public static void main(String[] args) {
        Utme account1 = new Utme("Jane Green", 250);
        Utme account2 = new Utme("John Blue", 175);

        System.out.printf("%s's utme score qualifies for: %s%n", account1.getName(), account1.getUtmeScore());
        System.out.printf("%s's utme score qualifies for: %s%n", account2.getName(), account2.getUtmeScore());
    }
}
