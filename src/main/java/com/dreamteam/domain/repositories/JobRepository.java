package com.dreamteam.domain.repositories;

import com.dreamteam.domain.entities.Job;

import java.util.List;

public interface JobRepository {
  void create(Job job);
  void modify(Job job);
  void deleteById(long id);
}
