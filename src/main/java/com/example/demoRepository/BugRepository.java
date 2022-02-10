package com.example.demoRepository;


import org.springframework.data.repository.CrudRepository;

import com.example.demoEntity.Bug;



public interface BugRepository  extends CrudRepository<Bug, Integer> {

	



}
