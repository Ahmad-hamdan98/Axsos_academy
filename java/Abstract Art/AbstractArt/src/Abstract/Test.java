package Abstract;

import java.util.ArrayList;
public class Test {
	 public static void main(String[] args) {
	        // TODO: create paintings and sculptures here
		 ArrayList<Art> museum = new ArrayList<Art> ();
		 
		 Painting pain1 = new Painting("thw world","Ahmad","very good","Oil");
		 Painting pain2 = new Painting("toun center","Hamdan","vice job","WaterColors");
		 Painting pain3 = new Painting("Batman","Sonar","Copyed","Oil&water");
		 
		 System.out.println(pain1.getPaintType());
		 System.out.println(pain2.getPaintType());
		 System.out.println(pain3.getPaintType());
		 
		 Sculpture scu1 = new Sculpture("Sezar","the Jocor","insain","Iron");
		 Sculpture scu2 = new Sculpture("The League","Orn","easy","Wood");
		 
		 
		 System.out.println(pain1.getTitle());
		 System.out.println(scu1.getMaterial());
		 System.out.println(scu2.getMaterial());
		 
		 museum.add(pain1);
		 museum.add(pain2);
		 museum.add(pain3);
		 museum.add(scu1);
		 museum.add(scu2);
		 for(Art show : museum) {
			 show.viewArt();
		 }
	
		 
	    }
}