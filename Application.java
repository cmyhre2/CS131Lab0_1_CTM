/*
 * This class uses Square & Circle classes to create objects
 * of those kinds and do stuff with them.
 * 
 * @author Chris Myhre
 * @version 0.1
 * Practice lab working with constructors and classes.
 * Spring 2023
*/
public class Application {

	public static void main(String[] args) {
		/*
		 * Instantiates a new Square object s
		 */
		Square s = new Square();
		/*
		 * @param Square the Square is sent into calling method
		 * @param double the value of s.side to be set
		 */
		s.setSide(2);
		/*
		 * @param s.area the value of s.area is calculated with area()
		 * Prints the area of Square s
		 */
		System.out.println("Square Area: " + s.area());
		
		/*
		 * Instantiates a new Circle object c
		 */
		Circle c = new Circle();
		/*
		 * @param Circle the Circle is sent into calling method
		 * @param double the value of c.radius to be set
		 */
		c.setRadius(1);
		/*
		 * @param c.area the value of c.area is calculated with area()
		 * Prints the area of Circle c
		 */
		System.out.println("Circle Area: " + c.area());
		

	}

}
