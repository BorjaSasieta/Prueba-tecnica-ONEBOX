package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class City {
	private String name;
	private List<Path> paths;
	
	public City(String n) {
		name = n;
	}
	
	public void addPath(Path path) {
		if(paths == null) {
			paths = new ArrayList<Path>();
		}
		paths.add(path);
	}
	
	public Map<Integer, City> getDestinationByName(String name){
		Map<Integer, City> ret = new HashMap<Integer, City>();
		for(Path p : paths) {
			if(p.getCityDestination().getName() == name) {
				ret.put(p.getDistance(),p.getCityDestination());
			}
		}	
		return ret;
	}
}
