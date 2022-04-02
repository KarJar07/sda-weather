package com.sda.weather.entry;

import org.hibernate.SessionFactory;

public class LocationRepositroyImpl implements LocationRepository { // todo rename to LocationRepositoryImpl SHIFT + F6

    private final SessionFactory sessionFactory;

    public LocationRepositroyImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
