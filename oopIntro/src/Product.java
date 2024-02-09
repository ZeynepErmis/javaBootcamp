public class Product {

    //final = restricting fields, fields can only set in the constructor
    //private = fields can only reach in the class
    private int id;
    private String name;
    private double unitPrice;
    private String detail;
    private double discount;

    public Product() {

    }

    public Product(int id, String name, double unitPrice, String detail, double discount) {
        super();
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
        this.discount = discount;
    }

    //read
    public int id() {
        return id;
    }

    //write
    public void setId(int id) {
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double unitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String detail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double discount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getUnitPriceAfterDiscount() {
        return this.unitPrice - (this.unitPrice * this.discount / 100);
    }


}
