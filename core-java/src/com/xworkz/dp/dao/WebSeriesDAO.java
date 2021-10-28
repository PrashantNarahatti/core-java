package com.xworkz.dp.dao;
import com.xworkz.dto.WebSeriesDTO;
import com.xworkz.dp.Constants.Genre;
public class WebSeriesDAO {
	private WebSeriesDTO[]  webseriesDTOs= new WebSeriesDTO[5];
    private int counter=0;
   
  public void saveDetails(WebSeriesDTO dto)
  {
	  System.out.println("Saved Web Series is :".concat("Got"));
  
    if(this.counter<this.webseriesDTOs.length && this.counter>=0)
	  {
		 this.webseriesDTOs[this.counter++]=dto;
		 
      }
    else
     {
      System.out.println("Cannot save the web series :".concat(String.valueOf(this.counter)));
     }
   }
  
  public void delete(int index) 
  {
	if(index<this.webseriesDTOs.length && index>=0)
	{
		this.webseriesDTOs[index]=null;
	}
	else 
	{
		System.err.println("Cannot delete because the index is out of range");
	}
  }
  public void update(WebSeriesDTO dto,int count)
  {
	  if(count>=0 && count<this.webseriesDTOs.length)
	  {
		  this.webseriesDTOs[count]=dto;
	  }
	  else
	  {
		  System.out.println("Cannnot update the count with dto".concat(String.valueOf(count)));
	  }
  }
  public WebSeriesDTO[] getWebseriesDTOs() {
	  return webseriesDTOs;
  }
  
  
}
