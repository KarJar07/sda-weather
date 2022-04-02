package com.sda.weather.entry;

public class LocationRepositoryMock implements LocationRepository{


    @Override
    public Location saveLocation(Location location) {
        location.setId(1L);
        return location;
    }
}
