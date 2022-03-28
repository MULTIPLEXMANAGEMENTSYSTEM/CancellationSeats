package com.MBS.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.MBS.Model.Seats;

public interface SeatsRepo  extends JpaRepository<Seats, Integer>{
	List < Seats > findAll();
}
