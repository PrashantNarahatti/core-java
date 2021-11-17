package com.xwokz.temple;

public class PublicAssociation implements DevoteeRule {

	@Override
	public boolean slipperOff() {
		System.out.println("invoked slipperOff");
		return true;
	}

	@Override
	public boolean donotTakePhoto() {
		System.out.println("invoked donotTakePhoto");
		return true;
	}

	@Override
	public boolean maintenaceSilent() {
		System.out.println("invoked maintenaceSilent");
		return true;
	}

}
