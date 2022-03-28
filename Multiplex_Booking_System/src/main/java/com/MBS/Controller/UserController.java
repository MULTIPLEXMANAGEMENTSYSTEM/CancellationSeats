package com.MBS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MBS.Exception.ResourceNotFoundException;
import com.MBS.Model.Seats;
import com.MBS.Service.SeatsService;
@RestController
@RequestMapping("/User")
public class UserController {
	@Autowired
	SeatsService service;


		@PostMapping("/addSeats")
		public ResponseEntity<String> addSeats(@RequestBody Seats seat){
			Seats s=service.addSeats(seat);
			return new ResponseEntity<String>("Inserted Successfully",HttpStatus.OK);
		}

	@GetMapping("/amount")
	public double CancelledAmount() {	
		double  s= service.CancelledAmount();
		if(s==0) {
			throw new ResourceNotFoundException("amount  should be paid");
		}
	return s;	
}
}