package test.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

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
	
	public Map<Integer, City> getDestinationByName(String name) throws NoSuchElementException{
		Map<Integer, City> ret = new HashMap<Integer, City>();
		try {
			for(Path p : paths) {
				if(p.getCityDestination().getName() == name) {
					ret.put(p.getDistance(),p.getCityDestination());
				}
			}
		}
		catch(NoSuchElementException e) {
			throw e;
		}
		return ret;
	}
}
