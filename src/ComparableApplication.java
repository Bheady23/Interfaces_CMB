/**
 * This application class tests the compareTo method in the RationalNumber class
 * @author Chris Burkhead
 * Programming project 2
 * Summer 2022
 *
 */
public class ComparableApplication {

	public static void main(String[] args) {
		
		
		RationalNumber c1=new RationalNumber(5, 9);
		RationalNumber c2=new RationalNumber(6, 8);
		RationalNumber c3=new RationalNumber(3, 4);
		RationalNumber c4=new RationalNumber(2, 3);
		RationalNumber c5=new RationalNumber(10, 18);
		
		System.out.println(c1.compareTo(c2));
		System.out.println(c2.compareTo(c3));
		System.out.println(c3.compareTo(c4));
		System.out.println(c1.compareTo(c4));
		System.out.println(c1.compareTo(c5));
		}//end main

}//end class



