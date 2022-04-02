package com.sda.weather.entry;

import com.fasterxml.jackson.databind.ObjectMapper;

public class LocationController {

    private final ObjectMapper objectMapper;
    private final LocationService locationService;

    public LocationController(ObjectMapper objectMapper, LocationService locationService) {
        this.objectMapper = objectMapper;
        this.locationService = locationService;
    }
}
