package com.sree.springbatch.execute;

public class User {
    private String name;
    private String occupation;
    private String country;

    public User() {

    }

    public User(String name, String occupation, String country) {
        this.name = name;
        this.country = country;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "User [Name=" + getName() + ", Occupation=" + getOccupation() + ", Country=" + getCountry() + "]";
    }
}
