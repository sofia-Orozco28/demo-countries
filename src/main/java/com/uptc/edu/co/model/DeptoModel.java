package com.uptc.edu.co.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeptoModel {
	
	private String nameDepto;
	private List<CityModel> cities;

}
