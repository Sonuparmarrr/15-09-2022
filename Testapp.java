package exercise.test3;

public class Testapp {
	public static void main (String[] args) {
	    ApartmentOwner p = new ApartmentOwner("Mr. XYZ");
			
			p.setApartments("Good Apartments, 96", 0);
			p.setApartments("New venue bloack3, 52", 1);
			p.setApartments("Anudip Residences, 9", 2);
			p.setApartments("Local City udaipurr, 30", 5);
			p.setApartments("Indias lodhi, 5000", 8);
			
			System.out.println(p);
			
			System.out.println("\n");
			
			System.out.println(p.getOwner() + " has " + p.countApartments() + " apartments");
		
			System.out.println("Apartment 2: " + p.getApartments(2));
			
			System.out.println();
			
			p.reorganizeApartments();
			System.out.println(p);
		}}
