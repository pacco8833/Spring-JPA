package net.genspark.Email.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produce")
public class Food {

    @Id
    private int skewId;
    private int quantity;

    @Column(unique = true)
    private String name;
    private double price;

    public Food(){}

    public Food(String name, double price, int quantity) {
        this.name = name;
        this.setPrice(price);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = Double.parseDouble(String.format("%.2f", price));
    }

    public String toString() {
        return this.name + this.quantity + " for $" + this.price;
    }

}
