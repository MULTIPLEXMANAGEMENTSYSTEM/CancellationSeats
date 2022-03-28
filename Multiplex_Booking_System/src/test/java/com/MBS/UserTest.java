package com.MBS;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.MBS.Model.Seats;
import com.MBS.Repository.SeatsRepo;

import com.MBS.Service.SeatsService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

@MockBean
private SeatsRepo repo;

@Autowired
private SeatsService service;

@Test
public void saveUser() {
Seats seat=new Seats(19,"2022-03-18",480,0, 0, "G",0, "2022-03-27",45);
when(repo.save(seat)).thenReturn(seat);
assertEquals(seat,service.addSeats(seat));
}
}


