package restaurant;

import java.math.BigDecimal;

public class Product {
    private String name;

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    private BigDecimal price;
    public Product(String name, BigDecimal price){
        this.name = name;
        this.price = new BigDecimal(String.valueOf(price));
    }

}
