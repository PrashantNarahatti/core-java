package com.xworkz.crudOperation;

public class CoolDrinkStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     CoolDrinkOperator operator=new CoolDrinkOperator();
     operator.addBrandName("coke");
     operator.addBrandName("mazza");
     operator.addBrandName("zeera");
     operator.addBrandName("7up");
     operator.addBrandName("dew");
     operator.addBrandName("merinda");
     operator.addBrandName("sting");
     
     operator.displayBrandName();
     
     String[] cbrand=operator.getBrandName();
     for(int brand=0;brand<cbrand.length;brand++)
		{
			String name=cbrand[brand];
			System.out.println(name);	   
		   

		}
	
     
     operator.deleteBrandName("limbu");
     
     
     operator.updateBrandName("slice");
     
    		 
	}

}
