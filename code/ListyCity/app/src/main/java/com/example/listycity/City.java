package com.example.listycity;

/**
 * Represents a City with a name and province.
 * Cities are comparable alphabetically by city name.
 */
public class City implements Comparable<City> {

    private String city;
    private String province;

    /**
     * Constructs a City object.
     *
     * @param city The name of the city
     * @param province The province of the city
     */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the name of the city.
     *
     * @return the city name
     */
    public String getCityName() {
        return this.city;
    }

    /**
     * Returns the province name.
     *
     * @return the province name
     */
    public String getProvinceName() {
        return this.province;
    }

    /**
     * Compares cities alphabetically by city name.
     *
     * @param o the other city to compare to
     * @return negative, zero, or positive depending on ordering
     */
    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.city);
    }

    /**
     * Checks if two cities are equal based on city name and province.
     *
     * @param o the object to compare
     * @return true if both city and province match
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;

        City city = (City) o;
        return this.city.equals(city.city) &&
                this.province.equals(city.province);
    }

    /**
     * Generates a hash code based on city and province.
     *
     * @return hash code value
     */
    @Override
    public int hashCode() {
        return city.hashCode() + province.hashCode();
    }
}
