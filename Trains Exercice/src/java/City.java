package java;

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
public class City {
	private String name;
	private List<Path> paths;
	
	public void addPath(Path path) {
		if(paths == null) {
			paths = new ArrayList<Path>();
		}
		paths.add(path);
	}
}
