package com.xwokz.temple;
import  com.xwokz.temple.DevoteeRule;
import  com.xwokz.temple.TempleAssociation;
import  com.xwokz.temple.PublicAssociation;

public class TempleStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DevoteeRule devoteeRule=new PublicAssociation();
		
		TempleAssociation templeAssociation=new TempleAssociation(devoteeRule,"ISKCON");
		templeAssociation.allowDevotees();
	}

}
