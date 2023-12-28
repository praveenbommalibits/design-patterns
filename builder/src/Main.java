public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Burger burger = new Burger.BurgerBuilder()
                . bread(true)
                .cheese(true)
                .mayonese(true)
                .build();
        Burger burger1 = new Burger.BurgerBuilder()
                .bread(true)
                .cheese(false)
                .mayonese(true)
                .onion(true)
                .build();
    }
}