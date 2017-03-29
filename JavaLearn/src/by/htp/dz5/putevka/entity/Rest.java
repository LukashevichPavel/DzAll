package by.htp.dz5.putevka.entity;

public class Rest extends Tur{
	private Rest rest;
	private String currortName; //Название курорта
	private String nameOfSea; //Название моря
	
	public Rest(){
		
	}
	
	public Rest(String name, String country, String city){
	super.setName(name);
	super.setCountry(country);
	super.setCity(city);
	
	}
	
	public void print(){
		System.out.println(super.getCountry());	
		}
	
}
