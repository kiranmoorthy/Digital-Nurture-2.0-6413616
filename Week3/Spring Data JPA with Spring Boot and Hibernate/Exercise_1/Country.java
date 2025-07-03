package com.cognizant.orm_learn.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Marks this class as a JPA entity
@Table(name = "country") // Maps this entity to the 'country' table
public class Country {

    @Id // Marks this field as the primary key
    @Column(name = "co_code") // Maps this field to the 'co_code' column
    private String code;

    @Column(name = "co_name") // Maps this field to the 'co_name' column
    private String name;

    // Default constructor is required by JPA
    public Country() {
    }

    // Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString() method for easy logging/debugging
    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}