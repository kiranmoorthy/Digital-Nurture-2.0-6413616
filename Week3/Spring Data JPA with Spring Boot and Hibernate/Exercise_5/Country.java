package com.example.country.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "co_code", length = 2, nullable = false)
    private String coCode;

    @Column(name = "co_name", nullable = false)
    private String coName;

    // No-argument constructor (required by JPA)
    public Country() {
    }

    // Parameterized constructor for convenience
    public Country(String coCode, String coName) {
        this.coCode = coCode;
        this.coName = coName;
    }

    // Getter for coCode
    public String getCoCode() {
        return coCode;
    }

    // Setter for coCode
    public void setCoCode(String coCode) {
        this.coCode = coCode;
    }

    // Getter for coName
    public String getCoName() {
        return coName;
    }

    // Setter for coName
    public void setCoName(String coName) {
        this.coName = coName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "coCode='" + coCode + '\'' +
                ", coName='" + coName + '\'' +
                '}';
    }
}