package com.xworkz.wrapperclasses;

public class CharacterStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 
	     Character penCost=15;
	     Character penCost1=18;
	     int pen=penCost1.compareTo(penCost);
	     System.out.println(pen);
	     
	    
	     Character ticketNo=20;
	    int ticket=ticketNo.hashCode();
	     System.out.println(ticket);
	   
	     
	     Character city='b';
		 char toUpperCase=city.toUpperCase('b');
			System.out.println(toUpperCase);
        
		 Character belt='P';
		 char toLowerCase=belt.toLowerCase('P');
		 System.out.println(toLowerCase);
		 
		 Character book=10;
		 int valueOf=book.valueOf(book);
			System.out.println(valueOf);
			
				
				
	}

}
