package com.example.demoController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demoEntity.Bug;
import com.example.demoService.BugService;

@RestController
public class BugController {
	@Autowired
	private BugService bugservice;

	//add bugs
		@PostMapping("/bugpost")
		public String addBug(@RequestBody Bug bug) {
			bugservice.addBug(bug);
			return "bug added";

	
}
		//get all bugs
		@GetMapping("/allbugs")
		public List<Bug> allBugs() {
			return bugservice.allBugs();
		}
		
		@PutMapping("/updatebugs{id}")
		public String updateBook(@PathVariable Integer id, @RequestBody Bug bug) {
			bugservice.updateBugs(id, bug);
			return "Bug Updated!!!";
		}	
}