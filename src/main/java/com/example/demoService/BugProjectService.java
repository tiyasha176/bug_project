package com.example.demoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demoEntity.BugProject;
import com.example.demoRepository.BugProjectRepository;


public class BugProjectService {
	@Autowired
	private BugProjectRepository bugProjectRepository;
	
	//add bug project
	public BugProject addBugProject(BugProject bugproject) {
		return bugProjectRepository.save(bugproject);
	}
	
	//get all 
	
	public List<BugProject> allBugProject() {
		// TODO Auto-generated method stub
		return (List<BugProject>) bugProjectRepository.findAll();
	}

	
}
