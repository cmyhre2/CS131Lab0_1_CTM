/*
 * This class is the cookie cutter for all Square objects created
 * with this class.
 * 
 * @author Chris Myhre
 * @version 0.1
 * Practice lab working with constructors and classes.
 * Spring 2023
*/
public class Square {

	double side; //Variable for the side length of a square.
	
	/*
	 *  The empty-argument constructor initializes all instance variables
	 */
	public Square(){
		side = 0.0;
	}//end default Square constructor
	
	/*
	 * @param 
	 */
	public Square(int l){
		side = l;
	}
	
	/*
	 *  @param l the value of l sent into setSide calling method
	 */
	public void setSide(double l) {
		side=l;
	}//end setSide
	
	/*
	 *  @param s the value of s sent into getSide calling method
	 *  @return the side length of Square s
	 */
	public double getSide(Square s) {
		return side;
	}//end getSide
	
	/*
	 *  @return the area of Square s
	 */
		public double area(){
			return Math.pow(side,2);
		}//end area
}
