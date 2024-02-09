package interfaces;

public class Main {

    public static void main(String[] args) {
        Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger()};
        CustomerManager customerManager = new CustomerManager(loggers);
        Customer zeynep = new Customer(1, "Zeynep", "Ermis");
        customerManager.add(zeynep);

    }
}
