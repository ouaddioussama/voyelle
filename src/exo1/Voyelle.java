package exo1;

import java.util.ArrayList;
import java.util.List;

public class Voyelle {
	
 	
	 
	public static void main(String[] args) {
		
		System.out.println(maMehtode("home")); //"ho","me"
		System.out.println(maMehtode("poupoul")); //"po"  "u"  "po"  "u"  "l"

	}

	
	public static boolean estVoyelle (char lettre ) {
		return  lettre == 'a' || lettre  == 'e' || lettre == 'i' || lettre == 'o' || lettre == 'u' ;
            
       }
	 
	public static  List<String> maMehtode(String mot){
		int index=0;
		List<String> maChaine=new ArrayList<>();		
		
		for(int i = 0; i < mot.length(); i++) {
	           char lettre = mot.charAt(i); 
	           
	           if(estVoyelle(lettre)) {
	        	   maChaine.add(mot.substring(index,i+1));
	        	   index=i+1;
	           }
	          

		} 
		
		if(index==0 || index != mot.length()) {
     	   maChaine.add(mot.substring(index));
	
		}
		
		return maChaine;
		
	}
}
