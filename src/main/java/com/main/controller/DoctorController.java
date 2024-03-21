package com.main.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Doctor;

@RestController
@RequestMapping("/api")
public class DoctorController
{
	
	@PostMapping("/register")
     public ResponseEntity<Doctor> registerDoctor(@RequestBody Doctor doctor)
     {
    	     
    	 return new ResponseEntity<Doctor>(doctor,HttpStatus.CREATED);
     }
	@GetMapping("/getDoctor")
	public ResponseEntity<Doctor> getDoctor()
	{
		Doctor d = new Doctor();
		d.setId(10002);
		d.setDocName("Tena");
		d.setSalary(8000.0);
		d.setSpecialization("Dermitology");
		
		return new ResponseEntity<Doctor>(d,HttpStatus.OK);
	}
}
