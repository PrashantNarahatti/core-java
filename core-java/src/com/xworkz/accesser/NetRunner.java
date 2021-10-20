package com.xworkz.accesser;
import com.xworkz.accesser.restrication.Intranet;


import static com.xworkz.accesser.restrication.Restrication;

import com.xworkz.accesser.restrication.Extranet;

public class NetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Internet internet=new Internet();
				internet.setName("End user");
				String internetUser=internet.getName();
				System.out.println(internetUser);
				
				Intranet intranet=new Intranet();
				
				intranet.setName("Organization");
				String IntranetUser=intranet.getName();
				System.out.println(IntranetUser);
				
				System.out.println(Extranet.user);
				
				Extranet extranet=new Extranet();
				extranet.setName("vendors access to organization");
				
				String extranetUser=extranet.getName();
				System.out.println(extranetUser);
				System.out.println(user);
				
		   
			}

		}


	}

}
