package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Maintains a list of City objects.
 * Provides functionality to add, remove, count, and check cities.
 */
public class CityList {

    private List<City> cities = new ArrayList<>();

    /**
     * Adds a city to the list if it does not already exist.
     *
     * @param city the city to add
     * @throws IllegalArgumentException if the city already exists
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Checks whether a city exists in the list.
     *
     * @param city the city to check
     * @return true if the city exists, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a city from the list if it exists.
     *
     * @param city the city to remove
     * @throws IllegalArgumentException if the city does not exist
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * Returns the number of cities in the list.
     *
     * @return number of cities
     */
    public int countCities() {
        return cities.size();
    }

    /**
     * Returns a sorted list of cities alphabetically.
     *
     * @return sorted list of cities
     */
    public List<City> getCities() {
        List<City> list = new ArrayList<>(cities);
        Collections.sort(list);
        return list;
    }
}
