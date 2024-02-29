package com.api.demo;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CUSTOMER_ORDER")
public class Order {
    private  @Id @GeneratedValue Long id;

    private String description;
    private String status;

    Order() {}

    Order(String description, String status) {
        this.description = description;
        this.status = status;
    }

    public String getDescription() {
        return this.description;
    }

    public String getStatus() {
        return this.status;
    }

    public Long getId() {
        return this.id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;

        Order order = (Order) o;
        
        return Objects.equals(this.description, order.description) && Objects.equals(this.status, order.status)
        && Objects.equals(this.id, order.id);
    }

    @Override
    public String toString() {
        return "Order of id: " + this.id + "\n" + this.description + "\n" + "Status: " + this.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.description, this.status, this.id);
    }
}
