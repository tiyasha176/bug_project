package com.example.demoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demoEntity.Bug;
import com.example.demoRepository.BugRepository;



@Service
public class BugService {
	@Autowired
	private BugRepository bugRepository;
	
	//add bug
	public Bug addBug(Bug bug) {
		return bugRepository.save(bug);
	}
	
	//get all bugs
	public List<Bug> allBugs() {
		// TODO Auto-generated method stub
		return (List<Bug>) bugRepository.findAll();
		
	}	
	
	public Bug updateBugs( int id, Bug bug) {
		Bug b1= bugRepository.findById(id).get();
		b1=bug;
		 bugRepository.save(b1);
		
		
		return bugRepository.save(bug);
	}

}
