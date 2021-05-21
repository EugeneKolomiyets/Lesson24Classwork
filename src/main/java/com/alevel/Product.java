package com.alevel;

import javax.persistence.*;

@Entity
@Table (name = "products")
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    long id;
    @Column (name = "name")
    String name;
    @Column (name = "price")
    double price;
    @Column (name="category_id")
    long category_id;

    public Product() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public long getCategory_id() {
        return category_id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory_id(long category_id) {
        this.category_id = category_id;
    }

    @Override
public String toString() {
        return Long.toString(this.id);
}

    public Product(long id, String name, double price, long category_id) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category_id = category_id;
    }

}
