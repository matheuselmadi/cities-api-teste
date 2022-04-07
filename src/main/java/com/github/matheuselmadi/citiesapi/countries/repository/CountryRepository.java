package com.github.matheuselmadi.citiesapi.countries.repository;

import com.github.matheuselmadi.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
