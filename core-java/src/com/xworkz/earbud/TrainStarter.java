package com.xworkz.earbud;

public class TrainStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String trainNo="02845";
    trainNo=trainNo.concat("vignesh Travelled , to meet grandma");
    System.out.println(trainNo);
    
    String trainNo1=new String("02846");
    trainNo=trainNo1.concat("vignesh came back");
    System.out.println(trainNo1);
    System.out.println(trainNo);
    System.out.println(trainNo+null);
    
    String max=null;
    System.out.println(max);
    
    String hospital=new String("Jayadev");
    hospital=hospital.toUpperCase();
    System.out.println(hospital);
    String kidney=hospital.toLowerCase();
    System.out.println(hospital);
    System.out.println(kidney);
    String hospital1=new String("Jayadev");
    hospital1.toUpperCase();
    System.out.println(hospital1);
    if(hospital==hospital1)
    {
    	System.out.println("both hospital and hospital1 pointing to same memory");   
    }
    else
    {
    	System.out.println("both hospital and hospital1 pointing to different memory"); 	
    }
    
    String medicine="Dolo 365";
    String instanceMedicine=new String("Dolo 365");
    if(medicine==instanceMedicine)
    {
    	System.out.println("both medicine and instanceMedicine pointing to same memory"); 
    }
    else
    {
    	System.out.println("both medicine and instanceMedicine  pointing to different memory"); 
    }
    medicine="45";
    boolean equal=medicine.equals(null);
    System.out.println("both content is"+equal); 
    
    medicine=null;
   
   
  
    	
     
	}

}
