package com.sda.weather.entry;

import com.fasterxml.jackson.databind.ObjectMapper;

public class LocationService {

    // todo develop this class

    private final LocationRepository locationRepository;
    private final ObjectMapper objectMapper;

    public LocationService(LocationRepository locationRepository, ObjectMapper objectMapper) {
        this.locationRepository = locationRepository;
        this.objectMapper = objectMapper;
    }

    Location createLocation(String city, String country) {
        if (city == null || city.isBlank()) {
            throw new IllegalArgumentException(" City cannot be null");
        }
        if (country == null || country.isBlank()) {
            throw new IllegalArgumentException(" Country cannot be null");
        }

        Location location = new Location(city, country);

        return location;
    }
}
