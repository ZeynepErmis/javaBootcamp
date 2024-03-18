package core.logging;

public class FileLogger implements Logger{
    public void log(String data) {
        System.out.println("Logged to the file: " + data);
    }
}
