package com.dreamteam.domain.entities;

import java.util.List;

public class User {
  private long id;
  private String username;
  private String email;
  private List<Skill> skills;
  private AccountType accountType;

  public User(long id, String username, String email, List<Skill> skills, AccountType accountType) {
    this.id = id;
    this.username = username;
    this.email = email;
    this.skills = skills;
    this.accountType = accountType;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Skill> getSkills() {
    return skills;
  }

  public void setSkills(List<Skill> skills) {
    this.skills = skills;
  }

  public AccountType getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountType accountType) {
    this.accountType = accountType;
  }
}
