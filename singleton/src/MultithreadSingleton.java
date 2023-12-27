public class MultithreadSingleton {
    public static MultithreadSingleton instance = null;

    private MultithreadSingleton() {

    }

    public static MultithreadSingleton getInstance() {
        if(instance == null) {
            synchronized (MultithreadSingleton.class) {
                if(instance == null) {
                    instance = new MultithreadSingleton();
                }
            }
        }
        return instance;
    }

    /**
     * This is the key method which is responsible during deserialization process
     * This method get invoked, and we are simply returning already created object
     * @return
     */
    protected Object readResolve() {
        return instance;
    }
}
