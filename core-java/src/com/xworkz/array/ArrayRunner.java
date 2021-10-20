package com.xworkz.array;

public class ArrayRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     long anmolPh=9108222564L;
     long shivaSai=8139966651L;
     long pooja=9880568275L;
     long rajeshwari=7204735375L;
     long prashant=9164768473L;
     
     long[] phoneNos= {prashant,rajeshwari,pooja,anmolPh,shivaSai,9986667354L};
     
     phoneNos[1]=9844722672L;
     long index4=phoneNos[4];
     System.out.println(index4);
     
     int len=phoneNos.length;
     for(int no=0;no<len;no++)
     {
    	 System.out.println(no);
    	 long ph=phoneNos[no];
    	 System.out.println(ph);
    	 
    }
      
     
	}

}
