public class Main {
    public static void main(String[] args) {
    EFFY_Logger myLogger = new EFFY_Logger();
    myLogger.print("info error");
    for(int i=0;i<10;i++) {
        myLogger.write("log.txt", true,"info error");
        try {
            Thread.sleep(2000);
                } catch (InterruptedException e) {
            e.printStackTrace();
            }
        }
    }
}
