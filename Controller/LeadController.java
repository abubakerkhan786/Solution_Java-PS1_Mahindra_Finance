package net.java.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.java.springboot.exception.ResourceNotFoundException;
import net.java.springboot.model.LeadsData;
import net.java.springboot.repository.LeadsRepository;

@RestController
@RequestMapping("/api/v1/")
public class LeadController {

	@Autowired
	private LeadService leadService;	
	
	// create employee rest api
	@PostMapping("/leads")
	public Employee createEmployee(@RequestBody LeadsData leadsData)throws LeadIdAlreadyPresent {

		String firstDigit = String.valueOf(leadsData.getMobileNumber()).chartAt(0);
		Integer firstDigit = Integer.ValueOf(firstDigit); 		

		if (firstDigit >=5)
		{
			throw new InvalidNumberFormatException ("First digit number should be greater than 5");
		}
		
		if(!(leadsData.getGender().EqualsIgnoreCase("Male") || (leadsData.getGender().EqualsIgnoreCase("Female"))))
		{
			throw new InvalidGenderTypeException ("Please enter valid gender");
		}
		else
		{
		
				return leadService.saveLead(leadsData);
		}
		
	}
	
	
	
	@GetMapping("/leads/{mobileNumber}") 
	public LeadsData fetchleadByMobileNumber(@PathVariable("mobileNumber") Long mobileNumber) throws NoLeadFoundWithTheMobileNumberException 
	{
		return leadService.fetchleadByMobileNumberService(mobileNumber);	
		
	}
	

	}
	
