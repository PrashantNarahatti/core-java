package com.xworkz.hostel;
import com.xworkz.hostel.HostelRule;
import com.xworkz.hostel.VisitorDay;

public class HostelScammer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HostelRule hostelRule=new SharavatiHostel();
		hostelRule.inTime();
		
		SharavatiHostel hostelRule2=new SharavatiHostel();
		hostelRule2.breakFastTime();
        hostelRule2.visitingDay();
        
		Object object=new SharavatiHostel();
	}

}
