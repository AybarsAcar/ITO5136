package com.dreamteam.domain.entities;

import java.util.List;

public class Job {
  private long id;
  private JobType type;
  private String description;
  private Location location;
  private List<Skill> requiredSkills;
  private List<JobCategory> categories;
  private double salary;

  // id the recruiter who owns the job post
  private long owner;
}