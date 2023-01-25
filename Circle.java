/*
 * This class is a cookie cutter for all Circle objects
 * created with this class
 * 
 * @author Chris Myhre
 * @version 0.1
 * Practice lab working with constructors and classes.
 * Spring 2023
*/
public class Circle {
	
	double radius; //Variable for the circle's radius.
	
	/*
	 *  The empty-argument constructor initializes all instance variables
	 */
	public Circle(){
		radius=0.0;
	}//end default Circle constructor
	
	/*
	 * @param l the value of l is sent into calling method
	 */
	public Circle(double l) {
		radius = l;
	}
	
	/*
	 *  @param l the value of l sent into setRadius calling method
	 */
	public void setRadius(double l){
		radius=l;
	}//end setRadius
	
	/*
	 *  @return the radius of Circle c
	 */
	public double getRadius() {
		return radius;
	}//end getRadius
	
	/*
	 *  @return the area of Circle c
	 */
	public double area(){
		return Math.PI*Math.pow(radius,2);
	}//end area
}
