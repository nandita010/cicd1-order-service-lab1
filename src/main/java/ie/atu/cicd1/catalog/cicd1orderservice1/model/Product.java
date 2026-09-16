package ie.atu.cicd1.catalog.cicd1orderservice1.model;

import java.math.BigDecimal;

public class Product {
    private Long id;
    private String name;
    private BigDecimal price;

    public Product() {}

    public Product(Long id, String name, BigDecimal price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
