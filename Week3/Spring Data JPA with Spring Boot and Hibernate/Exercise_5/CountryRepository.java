package com.example.country.repository;

import com.example.country.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    /**
     * Finds a list of countries where the name contains the given string, ignoring case.
     * Spring Data JPA automatically generates the query from this method name.
     */
    List<Country> findByCoNameContainingIgnoreCase(String partialName);
}