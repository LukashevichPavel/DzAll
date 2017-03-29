package by.htp.dz5.guitar;

public class Skvorechnik {
private String material;
private String color;
private String form;


public Skvorechnik(String material, String color, String form){
this.material = material;
this.color = color; 
this.form = form;
}


public String getMaterial() {
	return material;
}


public void setMaterial(String material) {
	this.material = material;
}




public String getForm() {
	return form;
}


public void setForm(String form) {
	this.form = form;
}


@Override
public String toString() {
	return "Барабан [материал]:" + material + ", [цвет]:" + color + ", [форма]:" + form;
}



}