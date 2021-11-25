package com.xworkz.vehicleNumber;


public class VehicleNumberOperator {

		private String[] num = new String[5];
		private int count = 0;

		public void save(String num) throws ValidVehicleRegisterException,StorageFullRunTimeException {
			System.out.println("Invoked save method from  Vehicle Number Operator");
			if (this.count < this.num.length && num != null) {
				this.num[this.count++] = num;
				if (num.startsWith("Alphabet",2) && num.endsWith("Number")) {
					System.out.println(" Vehicle Number is Valid");

				} else {
					System.err.println(" Vehicle Number is Invalid");
					throw new ValidVehicleRegisterException();
				}
			} else {
				System.err.println(" Vehicle Number is equal to null");
				throw new StorageFullRunTimeException();

			}
	}

}
