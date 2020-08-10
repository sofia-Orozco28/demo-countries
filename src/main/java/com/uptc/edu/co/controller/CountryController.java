package com.uptc.edu.co.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uptc.edu.co.model.CountryRSModel;
import com.uptc.edu.co.service.IgetCountryService;

@CrossOrigin("*")
@RestController
@RequestMapping(path ="/")
public class CountryController {
	
	@Autowired
	private IgetCountryService getCountriesService;
	
	@GetMapping(path ="/infoCountry")
	public ResponseEntity<Object> getCountries(@RequestParam (name = "country", required = true) String country)
	throws Exception{
		
		CountryRSModel response = getCountriesService.getCountries(country);
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}


}
