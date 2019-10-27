package app;

import java.util.Map;

public class Train_exercice_main {

	public static void main(String[] args) {
		Graph g = setTheExample();
		int cont = 0;
		try {
			System.out.println("The distance of the route A-B-C.");
			Map<Integer, City> val = g.getByName("A").getDestinationByName("B");
			cont += val.entrySet().iterator().next().getKey();
			cont += val.entrySet().iterator().next().getValue().getDestinationByName("C").entrySet().iterator().next().getKey();
			System.out.println("Output#1 " + cont);
			cont = 0;
		}
		catch(Exception e) {
			
		}
	}
	
	private static Graph setTheExample() {
		Graph ret = new Graph(null);
		City A = new City("A");
		City B = new City("B");
		City C = new City("C");
		City D = new City("D");
		City E = new City("E");
		Path path = createPath(A, B, 5);
		A.addPath(path);
		Path path2 = createPath(B, C, 4);
		B.addPath(path2);
		Path path3 = createPath(C, D, 8);
		C.addPath(path3);
		Path path4 = createPath(D, C, 8);
		D.addPath(path4);
		Path path5 = createPath(D, E, 6);
		D.addPath(path5);
		Path path6 = createPath(A, D, 5);
		A.addPath(path6);
		Path path7 = createPath(C, E, 2);
		C.addPath(path7);
		Path path8 = createPath(E , B, 3);
		E.addPath(path8);
		Path path9 = createPath(A, E, 7);
		A.addPath(path9);
		ret.addCity(A);
		ret.addCity(B);
		ret.addCity(C);
		ret.addCity(D);
		ret.addCity(E);
		return ret;
	}

	private static Path createPath(City origin, City destiny, int distance) {
		return new Path(origin,destiny,distance);
	}
}
