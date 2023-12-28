public class Burger {
    private int size;
    private boolean cheese;

    private boolean onion;
    private boolean bread;
    private boolean mayonese;

    private Burger(BurgerBuilder burgerBuilder) {
        //private Constructor
    }

    public int getSize() {
        return size;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isBread() {
        return bread;
    }

    public boolean isMayonese() {
        return mayonese;
    }

    public static class BurgerBuilder {
        private int size;
        private boolean cheese;

        private boolean onion;
        private boolean bread;
        private boolean mayonese;

        public BurgerBuilder size(int size) {
            this.size = size;
            return this;
        }

        public BurgerBuilder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }


        public BurgerBuilder onion(boolean onion) {
            this.onion = onion;
            return this;
        }
        public BurgerBuilder bread(boolean bread) {
            this.bread = bread;
            return this;
        }

        public BurgerBuilder mayonese(boolean mayonese) {
            this.mayonese = mayonese;
            return this;
        }

        public Burger build(){
            return new Burger(this);
        }


    }
}
