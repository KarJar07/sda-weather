package com.sda.weather.entry;

import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.dynalink.linker.support.Guards;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import static org.assertj.core.api.Assertions.assertThat;
//import static org.assertj.core.api.Assertions.catchThrowable;
import static org.junit.Assert.assertThat;

public class LocationServiceTest {

    LocationService locationService;

    @BeforeEach
    void setUp() {
        LocationRepository locationRepository = new LocationRepositoryMock();
        ObjectMapper objectMapper = new ObjectMapper();
        locationService = new LocationService(locationRepository, objectMapper);

    }

    @Test
    void createLocation_whenDataIsProper_returnsNewObject(){
        //when
        Location result = locationService.createLocation("Lodz", "Polska");
        //then
        assertThat(result).isNotNull;
    }
    @Test
    void createLocation_whenLocationIsEmpty_throwsAnException() {
        // when
        Throwable result = catchThrowable(() -> locationService.createLocation("   ", "Polska"));
        // then
        assertThat(result).isExactlyInstanceOf(IllegalArgumentException.class);
    }




}
