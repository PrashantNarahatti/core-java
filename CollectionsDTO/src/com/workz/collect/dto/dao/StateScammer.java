package com.workz.collect.dto.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.workz.collect.dto.StateDTO;

public class StateScammer {

	public static void main(String[] args) {
		StateDTO stateDTO1 = new StateDTO("Karnataka",31,226,"Basavaraj Bommai","Bangalore");
		StateDTO stateDTO2 = new StateDTO("Kerala",14,78,"Pinarayi Vijayan","Thiruvananthapuram");
		StateDTO stateDTO3 = new StateDTO("Manipur",16,4,"N.Biren Singh","Imphal");
		StateDTO stateDTO4 = new StateDTO("Andhra Pradesh",13,18,"Y.S.Jaganmohan Reddy","Amaravati");
		StateDTO stateDTO5 = new StateDTO("Goa",2,12,"Pramod Sawant","Panaji");
		StateDTO stateDTO6 = new StateDTO("Bihar",38,20,"Nitish Kumar","Patna");
		StateDTO stateDTO7 = new StateDTO("Assam",34,155,"Himanta Biswa Sarma","Dispur");
		StateDTO stateDTO8 = new StateDTO("Gujarat",33,252,"Bhupendrabhai Patel","Gandhinagar");
		StateDTO stateDTO9 = new StateDTO("Jharkhand",24,19,"Hemant Soren","Ranchi");
		StateDTO stateDTO10 = new StateDTO("Punjab",23,93,"Charanjit Sing Channi","Chandigarh");

		List<StateDTO> list = new ArrayList<StateDTO>();
		list.add(stateDTO1);
		list.add(stateDTO2);
		list.add(stateDTO3);
		list.add(stateDTO4);
		list.add(stateDTO5);
		list.add(stateDTO6);
		list.add(stateDTO7);
		list.add(stateDTO8);
		list.add(stateDTO9);
		list.add(stateDTO10);

		boolean stateDTO = list.remove(stateDTO8);
		System.out.println(stateDTO);

		boolean contain = list.contains(stateDTO3);
		System.out.println(contain);

		// list.clear();
		// System.err.println("cleared");

		int size = list.size();
		System.out.println(size);

		boolean empty = list.isEmpty();
		System.out.println(empty);

		Iterator<StateDTO> itr = list.iterator();
		while (itr.hasNext()) {
			StateDTO ele = itr.next();
			System.out.println(ele);
		}
	}

}
