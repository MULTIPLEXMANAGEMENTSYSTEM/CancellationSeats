package com.MBS.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.MBS.Model.Seats;
import com.MBS.Repository.SeatsRepo;
@Service
@Transactional
public class SeatsService{
	
		
			@Autowired
			SeatsRepo repo;
			public Seats addSeats(Seats s) {
			Seats e=repo.save(s);
			return e;
			}


	public double CancelledAmount() {
		List<Seats> s=repo.findAll();
		int m=0;
		int a=s.get(0).getNoOfSeats();
		int c=s.get(0).getNoOfSeatsCancelled();
		float b=a*s.get(0).getCostOfSeats();
		if(c>0) {
		double a1 =b*0.2f;
		double CancelledAmount=a1-b;
		return CancelledAmount;
		}else {
		return b;
		}
		}
}
