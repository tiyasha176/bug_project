package com.example.demoController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demoEntity.BugProject;
import com.example.demoService.BugProjectService;


public class BugProjectController {
	@Autowired
	private BugProjectService bugprojectservice;

	//add bug project
		@PostMapping("/saveproject")
		public String addBugProject(@RequestBody BugProject bugproject) {
			bugprojectservice.addBugProject(bugproject);
			return "project added";

	
}
		//get all bugs
		@GetMapping("/allbugs")
		public List<BugProject> allBugProjects() {
			return bugprojectservice.allBugProject();
		}
		
}
