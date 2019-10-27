package test.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Path {
	//Attributes
	private City cityOrigin;
	private City cityDestination;
	private int distance;
}
