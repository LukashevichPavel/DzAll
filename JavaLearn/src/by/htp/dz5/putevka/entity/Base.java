package by.htp.dz5.putevka.entity;

public class Base {
Tur[] turBase;
Hotel [] hotelBase;

public Base(){
	this.turBase = new Tur[10];
	this.hotelBase= new Hotel[10];	
	for (int i=0; i<turBase.length;i++) {
		turBase[i]=null;
		hotelBase[i]=null;
	} 
	
}	

public void startTur(){
	Base base = new Base();
	//hotelBase = new Hotel[10];
	//Tur[] turBase = new Tur[10];
	Hotel hotel1 = new Hotel();
	for (int i=0; i<10;i++){
	hotel1=hotel1.randomHotel();
	base.addToBase(hotel1);
	}
	base.print();
	//hotel1.print();
	Tur tur1 = new Rest("Горящий тур №1","Болгария","Бургас");
	tur1.print();
}

public void addToBase (Hotel hotel){
	if (hotel !=null){
		int count=0; 
		for (int i=0;i<this.hotelBase.length;i++){
			if (hotelBase[i]!=null) count++;
		}	
	this.hotelBase[count]=hotel;
	}
		
}

public void print(){
	for (int i=0;i<this.hotelBase.length; i++){
		if (this.hotelBase[i]!=null) {this.hotelBase[i].print();}
	}
}


public Tur[] getTurBase() {
	return turBase;
}

public Hotel[] getHotelBase() {
	return hotelBase;
}

public void setHotelBase(Hotel[] hotelBase) {
	this.hotelBase = hotelBase;
}

public void setTurBase(Tur[] turBase) {
	this.turBase = turBase;
}




}
