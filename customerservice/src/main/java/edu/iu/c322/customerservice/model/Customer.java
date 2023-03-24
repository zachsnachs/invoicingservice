package edu.iu.c322.customerservice.model;

import jakarta.validation.constraints.NotEmpty;

import java.util.Objects;

public class Customer {
    private int id;

    @NotEmpty(message = "name cannot be empty")
    private String name, email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && name.equals(customer.name) && email.equals(customer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }
}
