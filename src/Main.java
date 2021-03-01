public class Main {
    public static void main(String[] args) {
    EFFY_Logger myLogger = new EFFY_Logger();
    myLogger.print("системный сбой");
    myLogger.write("log.txt", true);
    }
}
