package app;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Graph {
	
	//attribute
	private List<City> cities;
	
	public void addCity(City city) {
		if(cities == null) {
			cities = new ArrayList<City>();
		}
		cities.add(city);
	}
	public City getByName(String name) {
		City ret = null;
		for(int i = 0; i < cities.size(); i++) {
			if(cities.get(i).getName() == name) {
				ret = cities.get(i);
			}
		}
		return ret; 
	}
}
