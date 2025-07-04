package com.example.country.service;

import com.example.country.model.Country;
import com.example.country.repository.CountryRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CountryService {

    private final CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    // Feature 1: Find a country by its code
    public Optional<Country> findCountryByCode(String countryCode) {
        return countryRepository.findById(countryCode);
    }

    // Feature 2: Add a new country
    public Country addCountry(Country country) {
        // You might add validation here to check if the country code already exists
        return countryRepository.save(country);
    }

    // Feature 3: Update an existing country
    public Country updateCountry(String countryCode, Country updatedCountryDetails) {
        Country country = countryRepository.findById(countryCode)
                .orElseThrow(() -> new EntityNotFoundException("Country not found with code: " + countryCode));

        country.setCoName(updatedCountryDetails.getCoName());
        return countryRepository.save(country);
    }

    // Feature 4: Delete a country
    public void deleteCountry(String countryCode) {
        if (!countryRepository.existsById(countryCode)) {
            throw new EntityNotFoundException("Country not found with code: " + countryCode);
        }
        countryRepository.deleteById(countryCode);
    }

    // Feature 5: Find countries by partial name
    public List<Country> findCountriesByPartialName(String partialName) {
        return countryRepository.findByCoNameContainingIgnoreCase(partialName);
    }
}