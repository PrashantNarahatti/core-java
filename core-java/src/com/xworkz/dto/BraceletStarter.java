package com.xworkz.dto;

public class BraceletStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BraceletDTO braceletDto=new BraceletDTO();
		braceletDto.setPrice(10.0f);
		braceletDto.setColour("Gold");
		braceletDto.setMaterial("Iron");
		braceletDto.setGemUsed(false);
		braceletDto.setGifted(true);
		
		BraceletDTO braceletDto1=new BraceletDTO(15.0f,"Green","Plastic",true,false);	
		BraceletDTO braceletDto2=new BraceletDTO(15.0f,"Red","Plastic",true,false);
		BraceletDTO braceletDto3=new BraceletDTO(15.0f,"Yellow","Plastic",true,false);
		BraceletDTO braceletDto4=new BraceletDTO(15.0f,"Blue","Plastic",true,false);
		BraceletDTO braceletDto5=new BraceletDTO(15.0f,"Pista","Plastic",true,false);
		
		BraceletDTO[] ref=new BraceletDTO[5];
		ref[0]=braceletDto;
		ref[2]=braceletDto1;
		
		for(int lock=0;lock<ref.length;lock++)
		{
			BraceletDTO ref1=ref[lock];
			if(ref1!=null) {
			System.out.println(ref1.getPrice());
			System.out.println(ref1.getColour());
			System.out.println(ref1.getMaterial());
			System.out.println(ref1.isGemUsed());
			System.out.println(ref1.isGifted());
			}
			else {
				System.out.println("ref1 is a null".concat(String.valueOf(lock)));
			}
			}
		
		}
			
	}


