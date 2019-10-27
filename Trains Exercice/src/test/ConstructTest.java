package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import test.classes.*;

class ConstructTest {

	@Test
	void createCityOk() {
		String name = "newCity";
		City city = new City("newCity");
		assertTrue(city.getName() == name);
	}
	
	@Test
	void createCityKo() {
		String name = "Kakariko";
		City city = new City("newCity");
		assertFalse(city.getName() == name);
	}
	
	@Test
	void createPathOk() {
		String name1 = "newCity";
		String name2 = "oldCity";
		City city = new City(name1);
		City city2 = new City(name2);
		Path path = new Path(city,city2, 4);
		assertTrue(path.getCityDestination() == city2);
	}
	
	@Test
	void createPathKo() {
		String name1 = "newCity";
		String name2 = "oldCity";
		City city = new City(name2);
		City city2 = new City(name1);
		Path path = new Path(city2,city, 12);
		assertFalse(path.getCityOrigin() == city);
	}
	
	@Test
	void createGraphOk() {
		Graph g = new Graph(null);
		City Barcelona = new City("Barcelona");
		City Valencia = new City("València");
		City Palma = new City("Palma");
		Path path1 = new Path(Barcelona,Valencia, 450);
		Path path2 = new Path(Barcelona,Palma, 355);
		Path path3 = new Path(Palma,Valencia, 189);
		Barcelona.addPath(path1);
		Barcelona.addPath(path2);
		Palma.addPath(path3);
		g.addCity(Barcelona);
		g.addCity(Valencia);
		g.addCity(Palma);
		assertTrue(g.getCities().get(2).getDestinationByName("València").values().iterator().next().getName() == "València");
	}
	@Test
	void createGraphKo() {
		Graph g = new Graph(null);
		City Barcelona = new City("Barcelona");
		City Valencia = new City("València");
		City Palma = new City("Palma");
		Path path1 = new Path(Barcelona,Valencia, 450);
		Path path2 = new Path(Barcelona,Palma, 355);
		Path path3 = new Path(Palma,Valencia, 189);
		Barcelona.addPath(path1);
		Barcelona.addPath(path2);
		Palma.addPath(path3);
		g.addCity(Barcelona);
		g.addCity(Valencia);
		g.addCity(Palma);
		assertFalse(g.getCities().get(0).getDestinationByName("València").values().iterator().next().getName() == "Palma");
	}
}