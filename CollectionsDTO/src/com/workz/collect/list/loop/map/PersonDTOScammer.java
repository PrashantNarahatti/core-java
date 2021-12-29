package com.workz.collect.list.loop.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PersonDTOScammer {

	public static void main(String[] args) {
		Map<PersonDTO,AddressDTO> personDTOAndAddressDTO= new HashMap<PersonDTO,AddressDTO>();
		PersonDTO personDTO1= new PersonDTO(1,"Pacchu",24,"prashantnarahatti@gmail.com");
		PersonDTO personDTO2 = new PersonDTO(2,"Raju",22,"raju@gmail.com");
		PersonDTO personDTO3 = new PersonDTO(3,"Vinayak",15,"vinayak@gmail.com");
		PersonDTO personDTO4 = new PersonDTO(4,"Pranu",23,"pranu@gmail.com");
		
		AddressDTO addressDTO1= new AddressDTO(1,10,"Navanagar","Bagalkot","587101");
		AddressDTO addressDTO2 = new AddressDTO(2,11,"Navanagar","Bagalkot","587101");
		AddressDTO addressDTO3 = new AddressDTO(3,12,"Navanagar","Bagalkot","587101");
		AddressDTO addressDTO4 = new AddressDTO(4,13,"Navanagar","Bagalkot","587101");
		
		personDTOAndAddressDTO.put(personDTO1, addressDTO1);
		personDTOAndAddressDTO.put(personDTO2, addressDTO2);
		personDTOAndAddressDTO.put(personDTO3, addressDTO3);
		personDTOAndAddressDTO.put(personDTO4, addressDTO4);
		
		Set<PersonDTO> set=personDTOAndAddressDTO.keySet();
        set.stream().forEach((e) -> System.out.println(e));
        
        System.out.println(System.lineSeparator());
        
        Collection<AddressDTO> collection=personDTOAndAddressDTO.values();
        collection.stream().forEach((e) -> System.out.println(e));
        
        System.out.println(System.lineSeparator());
        
        Set<Map.Entry<PersonDTO,AddressDTO>> entryset=personDTOAndAddressDTO.entrySet();
        Iterator<Map.Entry<PersonDTO,AddressDTO>> itr=entryset.iterator();
        while(itr.hasNext())
        {
        	Map.Entry<PersonDTO,AddressDTO> element =itr.next();
        	System.out.println(element.getKey()+ " ".concat("contains")+" ".concat(element.getValue()+" ".concat("address")));
        	
        	System.out.println(System.lineSeparator());

			entryset.forEach((entry) -> System.out.println(entry.getKey()+" ". concat(":") + " " .concat(String.valueOf(entry.getValue()))));
        }
		
		}

	}


