public class Main {
    public static void main(String[] args) {
        Logger logger1=Logger.getInstance();
        Logger logger2=Logger.getInstance();

        logger1.log("First Log Entry");
        logger2.log("Second Log entry");

        System.out.println("Same Instance? "+(logger1==logger2));
    }
}