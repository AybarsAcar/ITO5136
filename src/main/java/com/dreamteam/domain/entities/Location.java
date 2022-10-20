package com.dreamteam.domain.entities;

public class Location {
  private long id;
  private String postcode;
  private String city;
  private String state;

  public Location(long id, String postcode, String city, String state) {
    this.id = id;
    this.postcode = postcode;
    this.city = city;
    this.state = state;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }
}
