package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
    public void add(Product product) {
        System.out.println("Product added database with JDBC ");
    }
}
