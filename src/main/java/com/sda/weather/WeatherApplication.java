package com.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sda.weather.entry.LocationController;
import com.sda.weather.entry.LocationRepository;
import com.sda.weather.entry.LocationRepositroyImpl;
import com.sda.weather.entry.LocationService;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class WeatherApplication {
//    public static void main(String[] args) {
//        System.out.println("Hello World ");

    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        SessionFactory sessionFactory = new MetadataSources(registry)
                .buildMetadata()
                .buildSessionFactory();

        ObjectMapper objectMapper = new ObjectMapper();
        LocationRepository locationRepository = new LocationRepositroyImpl(sessionFactory);
        LocationService locationService = new LocationService (locationRepository, objectMapper);
        LocationController locationController = new LocationController (objectMapper, locationService);
        UserInterface userInterface = new UserInterface(locationController);

        userInterface.run();
    }

    }

