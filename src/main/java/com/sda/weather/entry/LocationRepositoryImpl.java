package com.sda.weather.entry;

import org.hibernate.SessionFactory;

public class LocationRepositoryImpl implements LocationRepository { // todo rename to LocationRepositoryImpl SHIFT + F6

    private final SessionFactory sessionFactory;


    public LocationRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Location saveLocation(Location location) {
        return null;
    }
}
