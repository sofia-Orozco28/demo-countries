package com.uptc.edu.co.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.uptc.edu.co.model.CountryRSModel;

@Service("GetCountryService")
public class GetCountryService  implements IgetCountryService{

	@Autowired
	private RestTemplate restTemplate;
	@Value("${countries}")
	private String countries;
	Gson gson = new Gson();
	
	@Override
	public CountryRSModel getCountries(String contry) throws Exception {
		
		CountryRSModel countryResponse = new CountryRSModel();
		try {
			System.out.println("COunTRiES");
			System.out.println(countries);
			countryResponse = gson.fromJson(countries, CountryRSModel.class);
			System.out.println("RESPONSE");
			System.out.println(gson.toJson(countryResponse));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
		return countryResponse;
	}

}
