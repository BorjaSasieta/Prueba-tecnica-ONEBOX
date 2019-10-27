package java;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Path {
	//Attributes
	private City cityOrigin;
	private City cityDestination;
	private int distance;
}
