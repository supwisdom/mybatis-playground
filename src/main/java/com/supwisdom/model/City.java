package com.supwisdom.model;

public class City {

  private Long id;
  private String name;
  private String state;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return new org.apache.commons.lang3.builder.ToStringBuilder(this)
        .append("id", id)
        .append("name", name)
        .append("state", state)
        .toString();
  }
}
