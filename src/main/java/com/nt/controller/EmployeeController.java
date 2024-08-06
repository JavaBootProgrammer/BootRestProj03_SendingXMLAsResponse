package com.nt.controller;

import com.nt.model.Employee;
import com.nt.model.JobDetails;
import com.nt.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping("/report")
	public ResponseEntity<Employee> getEmployee() {

		Employee employee = new Employee(1,
				"Raja",
				"USA",
				"9999");

		return new ResponseEntity<Employee>(employee, HttpStatus.OK);

	}

	@GetMapping("/userReport")
	public ResponseEntity<User> getUser() {

		List<String> listStrings = new ArrayList<String>();
		listStrings.add("One");
		listStrings.add("Two");
		listStrings.add("Three");
		listStrings.add("Four");


		Set<String> hash_Set = new HashSet<String>();

		// Adding elements to the Set
		// using add() method
		hash_Set.add("Geeks");
		hash_Set.add("For");
		hash_Set.add("Geeks");
		hash_Set.add("Example");

		Map<String, Integer> hm
				= new HashMap<String, Integer>();

		// Inserting pairs in above Map
		// using put() method
		hm.put("one", 100);
		hm.put("two", 200);
		hm.put("three", 300);
		hm.put("four", 400);

		JobDetails job=	new JobDetails("1","3","2");


		User user = new User(1, "Raja", "USA", "9999",
				new String[] { "iPhone", "Android" },
				listStrings,
				hash_Set,
				hm,
				job);
		return new ResponseEntity<User>(user, HttpStatus.OK);

	}
}
