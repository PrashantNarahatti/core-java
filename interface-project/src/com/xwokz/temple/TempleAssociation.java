package com.xwokz.temple;

public class TempleAssociation {
	
	private DevoteeRule devoteeRule;
	private String templeAssociationName;
	
	public TempleAssociation() {
		System.out.println("invoked TempleAssociation no-args const");
	}

	public TempleAssociation(DevoteeRule devoteeRule, String templeAssociationName) {
		super();
		this.devoteeRule = devoteeRule;
		this.templeAssociationName = templeAssociationName;
	}
	
	public void allowDevotees() {
		System.out.println("invoked allowDevotees");
		if(this.devoteeRule != null) {
				boolean slipperOff=this.devoteeRule.slipperOff();
				if(slipperOff) {
					
					boolean photo=this.devoteeRule.donotTakePhoto();
					boolean silent=this.devoteeRule.maintenaceSilent();
					if(photo && silent) {
						System.out.println("Good Devotees");
					}
					else
					{
						System.err.println("Bad Devotees");
					}
					}
				else {
					System.err.println("invoked is not devoteeRule");
						
					}
			}	
		}
		
}
   


