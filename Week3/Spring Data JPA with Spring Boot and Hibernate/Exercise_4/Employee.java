package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Marks this class as a JPA entity
public class Employee {

    @Id // Marks this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates ID
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

    // --- Manual Boilerplate Code Below ---

    // 1. No-argument constructor (REQUIRED by JPA)
    public Employee() {
    }

    // 2. Constructor with all fields (optional, but good for convenience)
    public Employee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // 3. Getters
    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    // 4. Setters (for fields that can be modified)
    public void setId(Integer id) {
        this.id = id; // Setter for ID is often not used manually if auto-generated, but good to have.
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // 5. (Optional but Recommended) Override toString(), equals(), hashCode()
    // You can have IntelliJ generate these for you:
    // Right-click in the class -> Generate... -> toString() / equals() and hashCode()
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // For equals() and hashCode(), robust implementations are complex.
    // For simplicity in this tutorial, we might omit them or use a basic ID-based one.
    // A simple ID-based equals/hashCode:
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id != null && id.equals(employee.id); // Equality based on ID
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0; // Hash code based on ID
    }
}