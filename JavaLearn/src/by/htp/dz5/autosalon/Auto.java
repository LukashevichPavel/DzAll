package by.htp.dz5.autosalon;

public class Auto {
	private int index;
	private int id,year,price;
	private String marka,model,color,regNumber;

public Auto(int id, String marka, String model, int year, String color, int price, String regNumber){ //Конструктор №1, полный
	this.id = id;
	this.marka = marka;
	this.model = model;
	this.year = year;
	this.color = color;
	this.price = price;
	this.regNumber = regNumber;
	}
public Auto (int id, String marka, String model){
	this.id = id;
	this.marka = marka;
	this.model = model;
}

public Auto getAuto(int index, Auto[] a){ //Возвращает Авто находящееся в позиции index
	Auto autoTemp = new Auto(a[index].getId(),a[index].getMarka(),a[index].getModel(),a[index].getYear(),a[index].getColor(),a[index].getPrice(),a[index].getRegNumber());
	return autoTemp; 
}
public int getId() {
	return this.id;
}
public void setId(int id) {
	this.id = id;
}
public int getYear() {
	return this.year;
}
public void setYear(int year) {
	this.year = year;
}
public int getPrice() {
	return this.price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getMarka() {
	return this.marka;
}
public void setMarka(String marka) {
	this.marka = marka;
}
public String getModel() {
	return this.model;
}
public void setModel(String model) {
	this.model = model;
}
public String getColor() {
	return this.color;
}
public void setColor(String color) {
	this.color = color;
}
public String getRegNumber() {
	return this.regNumber;
}
public void setRegNumber(String regNumber) {
	this.regNumber = regNumber;
}

public void printAuto(){
System.out.println(toString());
}
@Override
public String toString() {
	return "Auto [id=" + id + "]:[marka=" + marka + ", model=" + model + ", year=" + year + ", color=" + color
			+ ", price=" + price + ", regNumber=" + regNumber + "]";
}

	
}
