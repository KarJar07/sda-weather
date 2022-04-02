package com.sda.weather.entry;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

//warstwa logiki biznesowej
public class LocationService {

    // todo develop this class

    private final LocationRepository locationRepository;
    private final ObjectMapper objectMapper;

    public LocationService(LocationRepository locationRepository, ObjectMapper objectMapper) {
        this.locationRepository = locationRepository;
        this.objectMapper = objectMapper;
    }

    Location createLocation(String city, String country, Double longitude, Double latitude) {
        if (city == null || city.isBlank()) {
            throw new IllegalArgumentException(" City cannot be null");
        }
        if (country == null || country.isBlank()) {
            throw new IllegalArgumentException(" Country cannot be null");
        }
        if (longitude < -90D || longitude > 90D) {
            throw new IllegalArgumentException("Wrong longitude!");
        }
        if (latitude < -180D || latitude > 180D) {
            throw new IllegalArgumentException("Wrong latitude!");
        }

        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//
        Location location = new Location(city, country, longitude, latitude);
        Location saveLocation = locationRepository.saveLocation(location);


        return saveLocation;


    }
}
