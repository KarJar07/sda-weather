package com.sda.weather;

import com.sda.weather.entry.LocationController;

import java.util.Scanner;

public class UserInterface {

    private final LocationController locationController;

    public UserInterface(LocationController locationController) {this.locationController = locationController;}

    public void run() {
        System.out.println("Aplikacja jest uruchomiona\n");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n Witaj w aplikacji Pogoda,  wybierz opcje z menu: ");
            System.out.println("1 - dodaj lokalizacje do bazy danych");
            System.out.println(" 0 - zamknij aplikacje ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    createLocation();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Nie ma takiej opcji");
            }
        }

    }

    private void createLocation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" miasto ? ");
        String city = scanner.nextLine();
        System.out.println(" dlugosc geograficzna ?");
        Double longitude = scanner.nextDouble();
        System.out.println("szerokosc geograficzna ?");
        Double latiude = scanner.nextDouble();
        System.out.println("region ?");
        String region = scanner.nextLine();
        System.out.println(" kraj ?");
        String country = scanner.nextLine();

    }
}