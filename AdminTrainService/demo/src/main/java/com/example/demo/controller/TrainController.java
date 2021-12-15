package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Train;
import com.example.demo.repository.TrainRepository;

@RestController
@RequestMapping("/admincontrols")
public class TrainController {

	@Autowired
	TrainRepository trainrepository;
	
	
	@GetMapping("/")
	public String welcome()
	{
		return("welcome");
	}
	
	@GetMapping("/Trains")
	public List<Train> getAllTrains() {
		return trainrepository.findAll();
	}
	
	@GetMapping("/Trains/{id}")
	public Optional<Train> getTrains(@PathVariable("id") int id) {
		return trainrepository.findById(id);
	}
	
	@PostMapping("/Trains")
	public ResponseEntity<String> add(@RequestBody Train train) {
		trainrepository.save(train);
		return null;
	}
	
	@PutMapping("/Trains/{id}")
	public ResponseEntity<Train> updateTrain(@PathVariable("id") int id, @RequestBody Train train) {
	  trainrepository.save(train);
	  return null;
	}
	
	@DeleteMapping("/Trains/{id}")
	public void deleteTrain(@PathVariable("id") int id) {
	trainrepository.deleteById(id);   
  }
}