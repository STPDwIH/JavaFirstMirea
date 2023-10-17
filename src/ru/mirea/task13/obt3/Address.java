package ru.mirea.task13.obt3;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Address(String addressStr) {
        String[] parts = addressStr.split("\\[d\\]");

        if (parts.length >= 1) {
            country = parts[0].trim();
        }
        if (parts.length >= 2) {
            region = parts[1].trim();
        }
        if (parts.length >= 3) {
            city = parts[2].trim();
        }
        if (parts.length >= 4) {
            street = parts[3].trim();
        }
        if (parts.length >= 5) {
            house = parts[4].trim();
        }
        if (parts.length >= 6) {
            building = parts[5].trim();
        }
        if (parts.length >= 7) {
            apartment = parts[6].trim();
        }
    }

    @Override
    public String toString() {
        return "Страна: " + country + "\nРегион: " + region + "\nГород: " + city +
                "\nУлица: " + street + "\nДом: " + house + "\nКорпус: " + building +
                "\nКвартира: " + apartment;
    }
}
