package interfaces;

public class CustomerManager {

    //dependency injection
    private Logger[] loggers;

    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    public void add(Customer customer) {
        System.out.println("Customer has been added : " + customer.firstName());

        //class is static, that is why we directly called with the class name. No need to new it because of the static keyword!
        Utils.runLoggers(loggers, customer.firstName());
    }

    public void delete(Customer customer) {
        System.out.println("Customer has been deleted : " + customer.firstName());
        Utils.runLoggers(loggers, customer.lastName());


    }

    public void update(Customer customer) {
        System.out.println("Customer has been updated : " + customer.firstName());

    }
}
