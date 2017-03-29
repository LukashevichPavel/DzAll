package by.htp.dz5.guitar;

public class Struna {
private String produce;	//Производитель (DadDario, Sonata, Ernie, Elixir)
private String type; //Тип струны (Для электрогитары, аккустической гитары, басс гитары)
private String note; //Нота 
private int accuracy; //Соответствие идеальной ноте, то есть настроенность 100 - настроено, 0 - полностью не соответствует 
private String material; //Материал струны (Metal, Neylon, Silver,Bronze, Phosphor-bronze)
private double iznos; //Износ струны

public Struna (String produce, String type, String note,int accuracy, String material, double iznos){
	this.produce=produce;
	this.type=type;
	this.note=note;
	this.accuracy=accuracy;
	this.material=material;
	this.iznos=iznos;
}

public int getAccuracy() {
	return accuracy;
}

public void setAccuracy(int accuracy) {
	this.accuracy = accuracy;
}

public String getNote() {
	return note;
}
public void setNote(String note) {
	this.note = note;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
public double getIznos() {
	return iznos;
}
public void setIznos(double iznos) {
	this.iznos = iznos;
}
@Override
public String toString() {
	return " [производитель]:" + produce + ", [тип]:" + type + ", [материал]:" + material + ", [нота]:" + note + "[настроенность]" + accuracy + ", [износ]:"
			+ iznos;
}




}