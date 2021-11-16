package com.xworkz.rules;

import com.xworkz.rules.voting.AfricaCitizen;
import com.xworkz.rules.voting.IndianCitizen;
import com.xworkz.rules.voting.MarriageRule;
import com.xworkz.rules.voting.TraffiicRule;
import com.xworkz.rules.voting.VotingRule;

public class RulesStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VotingRule votingRule=new IndianCitizen();
		votingRule.valideAge();
		votingRule.validId();
		
		
		TraffiicRule trafficRule=new IndianCitizen(); 
		trafficRule.validLicence();
		trafficRule.licenseNo();
		trafficRule.validInsurance();
		
		MarriageRule marriageRule=new IndianCitizen();
		marriageRule.validAge('m', 17);
	
		
		Object object=new IndianCitizen();
		
		IndianCitizen indianCitizen=new IndianCitizen();
		System.out.println(indianCitizen.valideAge());
		System.out.println(indianCitizen.validId());
		System.out.println(indianCitizen.validLicence());
		System.out.println(indianCitizen.licenseNo());
		System.out.println(indianCitizen.validInsurance());
		System.out.println(indianCitizen.validAge('m', 24));
		indianCitizen.displayNameAndAddressDetails();
		System.out.println(indianCitizen.getName());
		System.out.println(indianCitizen.getAddress());
		System.out.println("~~~~~~~~~~~~~~~");
		
		IndianCitizen indianCitizen1=new IndianCitizen();
		System.out.println(indianCitizen1.valideAge());
		System.out.println(indianCitizen1.validId());
		System.out.println(indianCitizen1.validLicence());
		System.out.println(indianCitizen1.licenseNo());
		System.out.println(indianCitizen1.validInsurance());
		System.out.println(indianCitizen1.validAge('m', 24));
		indianCitizen1.displayNameAndAddressDetails();
		indianCitizen1.setName("Pranu");
		String name1=indianCitizen1.getName();
		System.out.println(name1);
		indianCitizen1.setAddress("Navanagar");
		String address1=indianCitizen1.getAddress();
		System.out.println(address1);
		System.out.println("~~~~~~~~~~~~~~~");
		
		IndianCitizen indianCitizen2=new IndianCitizen();
		System.out.println(indianCitizen2.valideAge());
		System.out.println(indianCitizen2.validId());
		System.out.println(indianCitizen2.validLicence());
		System.out.println(indianCitizen2.licenseNo());
		System.out.println(indianCitizen2.validInsurance());
		System.out.println(indianCitizen2.validAge('m', 24));
		indianCitizen2.displayNameAndAddressDetails();
		indianCitizen2.setName("Pacchi");
		String name2=indianCitizen2.getName();
		System.out.println(name2);
		indianCitizen2.setAddress("Badami");
		String address2=indianCitizen2.getAddress();
		System.out.println(address2);
		System.out.println("~~~~~~~~~~~~~~~");
		
		IndianCitizen indianCitizen3=new IndianCitizen();
		System.out.println(indianCitizen3.valideAge());
		System.out.println(indianCitizen3.validId());
		System.out.println(indianCitizen3.validLicence());
		System.out.println(indianCitizen3.licenseNo());
		System.out.println(indianCitizen3.validInsurance());
		System.out.println(indianCitizen3.validAge('m', 24));
		indianCitizen3.displayNameAndAddressDetails();
		indianCitizen3.setName("Raju");
		String name3=indianCitizen3.getName();
		System.out.println(name3);
		indianCitizen3.setAddress("Bidar");
		String address3=indianCitizen3.getAddress();
		System.out.println(address3);
		System.out.println("~~~~~~~~~~~~~~~");
		
		IndianCitizen indianCitizen4=new IndianCitizen();
		System.out.println(indianCitizen4.valideAge());
		System.out.println(indianCitizen4.validId());
		System.out.println(indianCitizen4.validLicence());
		System.out.println(indianCitizen4.licenseNo());
		System.out.println(indianCitizen4.validInsurance());
		System.out.println(indianCitizen4.validAge('m', 24));
		indianCitizen4.displayNameAndAddressDetails();
		indianCitizen4.setName("Abhi");
		String name4=indianCitizen4.getName();
		System.out.println(name4);
		indianCitizen4.setAddress("kamatagi");
		String address4=indianCitizen2.getAddress();
		System.out.println(address4);
		System.out.println("~~~~~~~~~~~~~~~");
		
		AfricaCitizen africaCitizen=new AfricaCitizen();
		System.out.println(africaCitizen.valideAge());
		System.out.println(africaCitizen.validId());
		System.out.println(africaCitizen.validLicence());
		System.out.println(africaCitizen.licenseNo());
		System.out.println(africaCitizen.validInsurance());
		System.out.println(africaCitizen.validAge('m', 23));
		africaCitizen.displayDetails();
		System.out.println(africaCitizen.getName());
		System.out.println(africaCitizen.getStateName());
		System.out.println("~~~~~~~~~~~~~~~");
		
		AfricaCitizen africaCitizen1=new AfricaCitizen();
		System.out.println(africaCitizen1.valideAge());
		System.out.println(africaCitizen1.validId());
		System.out.println(africaCitizen1.validLicence());
		System.out.println(africaCitizen1.licenseNo());
		System.out.println(africaCitizen1.validInsurance());
		System.out.println(africaCitizen1.validAge('m', 21));
		africaCitizen1.displayDetails();
		africaCitizen1.setName("Dulani");
	    String Aname1=africaCitizen1.getName();
	    System.out.println(Aname1);
	    africaCitizen1.setStateName("Benin");
	    String AstateName1=africaCitizen1.getStateName();
	    System.out.println(AstateName1);
		System.out.println("~~~~~~~~~~~~~~~");
		
		AfricaCitizen africaCitizen2=new AfricaCitizen();
		System.out.println(africaCitizen2.valideAge());
		System.out.println(africaCitizen2.validId());
		System.out.println(africaCitizen2.validLicence());
		System.out.println(africaCitizen2.licenseNo());
		System.out.println(africaCitizen2.validInsurance());
		System.out.println(africaCitizen2.validAge('m', 21));
		africaCitizen2.displayDetails();
		africaCitizen2.setName("Dumaka");
	    String Aname2=africaCitizen2.getName();
	    System.out.println(Aname2);
	    africaCitizen2.setStateName("Botswana");
	    String AstateName2=africaCitizen2.getStateName();
	    System.out.println(AstateName2);
		System.out.println("~~~~~~~~~~~~~~~");
		
		AfricaCitizen africaCitizen3=new AfricaCitizen();
		System.out.println(africaCitizen3.valideAge());
		System.out.println(africaCitizen3.validId());
		System.out.println(africaCitizen3.validLicence());
		System.out.println(africaCitizen3.licenseNo());
		System.out.println(africaCitizen3.validInsurance());
		System.out.println(africaCitizen3.validAge('m', 21));
		africaCitizen3.displayDetails();
		africaCitizen3.setName("Ebo");
	    String Aname3=africaCitizen3.getName();
	    System.out.println(Aname3);
	    africaCitizen3.setStateName("Burkina Faso");
	    String AstateName3=africaCitizen3.getStateName();
	    System.out.println(AstateName3);
	    System.out.println("~~~~~~~~~~~~~~~");
	    
	    AfricaCitizen africaCitizen4=new AfricaCitizen();
		System.out.println(africaCitizen4.valideAge());
		System.out.println(africaCitizen4.validId());
		System.out.println(africaCitizen4.validLicence());
		System.out.println(africaCitizen4.licenseNo());
		System.out.println(africaCitizen4.validInsurance());
		System.out.println(africaCitizen4.validAge('m', 21));
		africaCitizen4.displayDetails();
		africaCitizen4.setName("Fadil");
	    String Aname4=africaCitizen4.getName();
	    System.out.println(Aname4);
	    africaCitizen4.setStateName("Chad");
	    String AstateName4=africaCitizen4.getStateName();
	    System.out.println(AstateName4);
	    System.out.println("~~~~~~~~~~~~~~~");
	}

}
