package com.sda.weather.entry;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String city;
    private String country;
    private Double longitude;
    private Double latitude;

    public Location(String city, String country) {
        this.city = city;
        this.country = country;
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
