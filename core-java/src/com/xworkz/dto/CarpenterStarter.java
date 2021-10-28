package com.xworkz.dto;

public class CarpenterStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carpenter carpenter = new Carpenter();
		carpenter.setName("Seema");
		carpenter.setAge(24);
		carpenter.setGender('M');
		carpenter.setHeight(5.30f);

		Carpenter carpenter1 = new Carpenter("Rahul", 25, 'M', 4.39f);
		Carpenter carpenter2 = new Carpenter("Naveen", 23, 'M', 5.39f);
		Carpenter carpenter3 = new Carpenter("Shivu", 28, 'M', 4.99f);
		Carpenter carpenter4 = new Carpenter("Shilpa", 21, 'F', 3.96f);

		Carpenter[] ref = new Carpenter[5];
		ref[0] = carpenter;
		ref[2] = carpenter1;

		for (int lock = 0; lock < ref.length; lock++) {
			Carpenter ref1 = ref[lock];
			if (ref1 != null) {
				System.out.println(ref1.getName());
				System.out.println(ref1.getAge());
				System.out.println(ref1.getGender());
				System.out.println(ref1.getHeight());
			} else {
				System.out.println("ref1 is a null".concat(String.valueOf(lock)));
			}
		}

	}

}
