package com.example.demoRepository;

import org.springframework.data.repository.CrudRepository;

import com.example.demoEntity.BugProject;

public interface BugProjectRepository extends CrudRepository<BugProject, Integer>{

}
