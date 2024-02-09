package inheritance;

public class Main {
    public static void main(String[] args) {
        IndividualCustomer zeynep = new IndividualCustomer();
        zeynep.customerNumber = "1234";

        CorporateCustomer amazon = new CorporateCustomer();
        amazon.customerNumber = "12322";

        XCustomer abc = new XCustomer();
        abc.customerNumber = "02399";

        CustomerManager customerManager = new CustomerManager();

        Customer[] customers = {zeynep, abc, amazon};
        customerManager.addMultiple(customers);
    }
} 